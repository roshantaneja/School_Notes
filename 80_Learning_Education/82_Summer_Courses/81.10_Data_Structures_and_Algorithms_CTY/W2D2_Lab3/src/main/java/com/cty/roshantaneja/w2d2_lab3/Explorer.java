package com.cty.roshantaneja.w2d2_lab3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.*;
import java.util.Comparator;
import java.util.List;

/**
 * Allows creation and selection of Drawing Spaces
 *
 * @author Brian Sea
 * @version 0.0.1
 * @since PSet 3
 */
public class Explorer extends BorderPane {

    private final WorkSpace parent;
    private final ListView<DrawingSpace> spaces;
    private final Image ascendingImg, descendingImg, sortNoneImg, addImg, saveWork, loadWork;

    private SPACE_ORDERING order = SPACE_ORDERING.ORDER_NONE;
    enum SPACE_ORDERING {
        ORDER_NONE,
        ORDER_DESCEND,
        ORDER_ASCEND;

        // Allow moving to the "next" one in a cycle
        private static final SPACE_ORDERING[] vals = values();
        public SPACE_ORDERING next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }
    }

    /**
     * Creates the graphical selection in a project
     * @param parent the workspace to display the drawing
     */
    public Explorer(WorkSpace parent){
        this.parent = parent;

        // Load images
        descendingImg = new Image(getClass().getResource("/img/sort-ascending.png").toString());
        ascendingImg = new Image(getClass().getResource("/img/sort-descending.png").toString());
        sortNoneImg = new Image(getClass().getResource("/img/sort-none.png").toString());
        addImg = new Image(getClass().getResource("/img/add-image.png").toString());
        saveWork = new Image(getClass().getResource("/img/save-work.png").toString());
        loadWork = new Image(getClass().getResource("/img/load-work.png").toString());

        HBox toolbar = createToolbar();

        // Use a custom cell for the graphical list
        spaces = new ListView<>();
        spaces.setEditable(true);
        spaces.setCellFactory( lv -> {
            return new DrawingSpaceListCell();
        });

        // Change the drawing shown based on list
        spaces.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number from, Number to) {
                int select = to.intValue();
                if( select < 0 ){
                    select = from.intValue();
                }

                if( select < spaces.getItems().size() ) {
                    spaces.getSelectionModel().select(select);
                    parent.setCenter(spaces.getItems().get(select));
                }
            }
        });

        HBox spaceConfig = createWorkspaceConfig();

        setTop(toolbar);
        setCenter(spaces);
        setBottom(spaceConfig);
    }

    public JsonNode toJSON(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        ObjectNode root = mapper.createObjectNode();
        root.put("type", this.parent.getClass().getName());

        ArrayNode spaces = mapper.createArrayNode();
        for( DrawingSpace d : this.spaces.getItems() ){
            spaces.add(d.toJSON());
        }
        root.put("spaces", spaces);
        return root;
    }

    public void fromJSON( JsonNode tree ){
        spaces.getItems().clear();
        for( JsonNode jn : tree.get("spaces")){
            DrawingSpace ds = new DrawingSpace();
            ds.fromJSON(jn);
            spaces.getItems().add(ds);
        }

        spaces.getSelectionModel().select(0);
    }

    private HBox createWorkspaceConfig(){
        int IMG_PX = 25;

        HBox toolbar = new HBox();
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button save = new Button();
        ImageView iv = new ImageView(saveWork);
        iv.setFitWidth(IMG_PX);
        iv.setFitHeight(IMG_PX);
        save.setGraphic(iv);

        Button load = new Button();
        iv = new ImageView(loadWork);
        iv.setFitWidth(IMG_PX);
        iv.setFitHeight(IMG_PX);
        load.setGraphic(iv);
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fc = new FileChooser();
                FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
                fc.setTitle("Save Workspace");
                fc.getExtensionFilters().add(extFilter);

                Window win = parent.getScene().getWindow();
                File file = fc.showSaveDialog(win);
                if( file != null ) {
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        String json = mapper.writeValueAsString(toJSON());

                        // Print the table out for this lab
                        Compressor compressor = new Compressor();
                        byte[] compressData = compressor.compress(json);
                        json = new String( compressData, "UTF-8");

                        PrintWriter pw = new PrintWriter(file);
                        pw.write(json);
                        pw.close();
                    } catch (FileNotFoundException e) {
                    } catch (JsonProcessingException e) {
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fc = new FileChooser();
                FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
                fc.setTitle("Save Workspace");
                fc.getExtensionFilters().add(extFilter);

                Window win = parent.getScene().getWindow();
                File file = fc.showOpenDialog(win);
                if( file != null ) {
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        FileInputStream fis = new FileInputStream(file);
                        byte[] data = new byte[(int) file.length()];
                        fis.read(data);
                        fis.close();

                        Compressor compressor = new Compressor();
                        String str = compressor.decompress(data);
                        JsonNode tree = mapper.readTree(str);
                        fromJSON(tree);

                    } catch (FileNotFoundException e) {
                    } catch (JsonProcessingException e) {
                    } catch (IOException e) {
                    }
                }
            }
        });

        toolbar.getChildren().addAll(save, spacer, load);
        return toolbar;
    }

    private HBox createToolbar(){
        int IMG_PX = 25;

        HBox toolbar = new HBox();


        Button create = new Button("");
        ImageView iv = new ImageView(addImg);
        iv.setFitWidth(IMG_PX);
        iv.setFitHeight(IMG_PX);
        create.setGraphic(iv);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button sort = new Button("");
        iv = new ImageView(sortNoneImg);
        iv.setFitWidth(IMG_PX);
        iv.setFitHeight(IMG_PX);
        sort.setGraphic(iv);

        toolbar.getChildren().addAll(sort, spacer, create);

        // Create an Untitled Drawing
        create.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DrawingSpace newSpace = new DrawingSpace();
                spaces.getItems().add(newSpace);
                spaces.getSelectionModel().select(spaces.getItems().size()-1);
                parent.setCenter(newSpace);

                sortItems();
            }
        });

        // Cycle through sorting the names of the DrawingSpaces
        sort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                order = order.next();

                Image picture = sortNoneImg;
                if( order == SPACE_ORDERING.ORDER_ASCEND){
                    picture = ascendingImg;
                }
                else if( order == SPACE_ORDERING.ORDER_DESCEND){
                    picture = descendingImg;
                }

                sortItems();
                ((ImageView)sort.getGraphic()).setImage(picture);
            }
        });

        return toolbar;
    }



    /**
     * Sorts the graphical items in the list based on current setting
     */
    private void sortItems() {
        if( order == SPACE_ORDERING.ORDER_NONE){
            return;
        }

        ObservableList<DrawingSpace> list = spaces.getItems();

        // Create the correct BST
        BSTree<DrawingSpaceDescend> tree = null;
        if( order == SPACE_ORDERING.ORDER_DESCEND) {
            tree = new BSTree<>();
        }
        else if( order == SPACE_ORDERING.ORDER_ASCEND ){
            tree = new BSTree<>(new DrawingSpaceAscend());
        }

        // Add the spaces the BST and display the
        // sorted names
        for (DrawingSpace space : list) {
            tree.add(new DrawingSpaceDescend(space));
        }
        List<DrawingSpaceDescend> sorted = tree.inOrder();
        list.clear();
        for(DrawingSpaceDescend space : sorted ){
            list.add(space.space);
        }
    }

    /**
     * Allows Sorting DrawingSpaces in a descending fashion
     * Ignores case for sorting
     */
    private class DrawingSpaceDescend implements Comparable<DrawingSpaceDescend>{
        public DrawingSpace space;

        public DrawingSpaceDescend( DrawingSpace space ){
            this.space = space;
        }
        public int compareTo(DrawingSpaceDescend other){
            return this.space.getName().toLowerCase().compareTo(other.space.getName().toLowerCase());
        }
    }

    /**
     * Allows sorting DrawingSpaces in an Ascending fashion
     * Ignores case for sorting
     */
    private class DrawingSpaceAscend implements Comparator<DrawingSpaceDescend>{
        @Override
        public int compare(DrawingSpaceDescend a, DrawingSpaceDescend b) {
            return b.space.getName().toLowerCase().compareTo(a.space.getName().toLowerCase());
        }
    }


    /**
     * Custom Graphical Cell for the ListView
     * Displays DrawingSpaces
     */
    private class DrawingSpaceListCell extends ListCell<DrawingSpace>{
        private TextField text;
        private Insets defaultInsets;

        public DrawingSpaceListCell() {
            defaultInsets = new Insets(5,5,5,5);

            text = new TextField();
            text.setBorder(null);
            text.maxWidthProperty().bind(this.widthProperty());

            // Pressing enter actually changes the name of the space
            text.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    commitEdit(getItem());
                }
            });

            // Pressing ESCAPE resets the name change
            text.addEventFilter(KeyEvent.KEY_RELEASED, e -> {
                if( e.getCode() == KeyCode.ESCAPE){
                    cancelEdit();
                }
            });
        }

        @Override
        protected void updateItem(DrawingSpace space, boolean empty ){
            super.updateItem(space, empty);

            String name = null;
            if( !empty ) {
                name = space.getName();
            }

            setText(name);
            setGraphic(null);
            setPadding(defaultInsets);
        }

        @Override
        public void startEdit(){
            super.startEdit();
            setPadding(new Insets(0,0,0,0));

            text.setText(getItem().getName());
            setText(null);
            setGraphic(text);

            text.selectAll();
            text.requestFocus();
        }
        @Override
        public void cancelEdit(){
            super.cancelEdit();
            setGraphic(null);setPadding(defaultInsets);
            setText(getItem().getName());
        }

        @Override
        public void commitEdit(DrawingSpace space ){
            super.commitEdit(space);
            setPadding(defaultInsets);
            space.setName(text.getText());
            setText(text.getText());
            setGraphic(null);
            parent.setCenter(getItem());

            // Changed a name, so resort!
            sortItems();
        }

    }
}
