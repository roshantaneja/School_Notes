# AuthorSignature.java

```java
public class AuthorSignature
{ 
    // declare private instance variables here
    
    private String authorName;
    private double avgWordLength, differentWordRatio, hapaxRatio, avgWordsPerSentence, avgPhrasesPerSentence;
    private static final double[] WEIGHT = {11.0, 33.0, 50.0, 0.4, 4.0};
    
    public AuthorSignature(String authorName, double avgWordLength, double differentWordRatio, double hapaxRatio, double avgWordsPerSentence, double avgPhrasesPerSentence )
    {
        
        this.authorName = authorName;
        this.avgWordLength = avgWordLength;
        this.differentWordRatio = differentWordRatio;
        this.hapaxRatio = hapaxRatio;
        this.avgWordsPerSentence = avgWordsPerSentence;
        this.avgPhrasesPerSentence = avgPhrasesPerSentence;
        
        // "the job of the constructor is to initialize the private instance varables"
        
    }
    
    public double distanceTo(AuthorSignature a){
        double[] unknownSet = a.getSignatureSet();
        double[] thisSet = this.getSignatureSet();
        double sum = 0.0;
        for (int i = 0; i < 5; i++) {
            sum += Math.abs(thisSet[i] - unknownSet[i]) * WEIGHT[i];
        }
        return sum;
        
    }
    
    // you'll need five more methods here
    
    public String getName(){return authorName;}
    public double getAvgWordLength(){return avgWordLength;}
    public double getDifferentWordRatio(){return differentWordRatio;}
    public double getHapaxRatio(){return hapaxRatio;}
    public double getAvgWordsPerSentence(){return avgWordsPerSentence;}
    public double getAvgPhrasesPerSentence(){return avgPhrasesPerSentence;}
    
    public double[] getSignatureSet(){
        double[] result = {avgWordLength, differentWordRatio, hapaxRatio, avgWordsPerSentence, avgPhrasesPerSentence};
        return result;
    }
    
}
```

# AuthorshipDetection.java

```java
import acm.program.*;
import java.util.ArrayList;

public class AuthorshipDetection extends ConsoleProgram
{
    private static final String PUNCTUATION = "'!\",;:.-?)([]<>*#\n\t\r ";
    private static final String VOWELS = "aeiouy";
    
    private AuthorSignature[] authors;

    public void run()
    {
        loadAuthorSignatures();
        String filename = readLine("Enter file name: ");
        String fileContents = FileHelper.getFileContents(filename);
        ArrayList<String> sentences = getSentenceFromContents(fileContents);
        ArrayList<String> words = new ArrayList<String>();
        
        AuthorSignature unknownAuthor;
        
        for (String sentence: sentences)
        {
            ArrayList<String> splitSentences = getWordsFromSentence(sentence);
            for (String word: splitSentences) 
            {
                words.add(word);
            }
        }
        println("Sentences====" + sentences.size());
        println("Words====" + words.size());
        
        println();
        
        
        double a = computerAverageWordLength(words);
        println("    Avg Word Length = " + a);
        double b = computeDifferentWordRatio(words);
        println("    Diff word Ratio = " + b);
        double c = computeHapaxLegomenaRatio(words);
        println("    Hapax legomanana ratio = " + c);
        double d = computeAverageWordsPerSentence(sentences);
        println("    Avg words per sentence = " + d);
        double e = computeSentenceComplexity(sentences);
        println("    Sentence complexity = " + e);
        
        unknownAuthor = new AuthorSignature("unknown", a, b, c, d, e);
        
        println();
        
        String champName = "";
        double champScore = Integer.MAX_VALUE;
        for (AuthorSignature author:authors){
            double score = author.distanceTo(unknownAuthor);
            if (score < champScore){
                champScore = score;
                champName = author.getName();
            }
            println(author.getName() + ": " + score);
        }
        
        println();
        println("Predicted author = " + champName);
        
        // task #1 goes here
    }

    // you'll do tasks #2 through #12 here
    
    // I wrote this method for you
    private void loadAuthorSignatures()
    {
        authors = new AuthorSignature[13];
        authors[0] = new AuthorSignature("Agatha Christie", 4.40212537354, 0.103719383127, 0.0534892315963, 10.0836888743, 1.90662947161);
        authors[1] = new AuthorSignature("Alexandre Dumas", 4.38235547477, 0.049677588873, 0.0212183996175, 15.0054854981, 2.63499369483);
        authors[2] = new AuthorSignature("Brothers Grimm", 3.96868608302, 0.0529378997714, 0.0208217283571, 22.2267197987, 3.4129614094);
        authors[3] = new AuthorSignature("Charles Dickens", 4.34760725241, 0.0803220950584, 0.0390662700499, 16.2613453121, 2.87721723105);
        authors[4] = new AuthorSignature("Douglas Adams", 4.33408042189, 0.238435104414, 0.141554321967, 13.2874354561, 1.86574870912);
        authors[5] = new AuthorSignature("Emily Bronte", 4.35858972311, 0.089662598104, 0.0434307152651, 16.1531664212, 2.93439550141);
        authors[6] = new AuthorSignature("Fyodor Dostoevsky", 4.34066732195, 0.0528571428571, 0.0233414043584, 12.8108273249, 2.16705364781);
        authors[7] = new AuthorSignature("James Joyce", 4.52346300961, 0.120109917189, 0.0682315429476, 10.9663296918, 1.79667373227);
        authors[8] = new AuthorSignature("Jane Austen", 4.41553119311, 0.0563451817574, 0.02229943808, 16.8869087498, 2.54817097682);
        authors[9] = new AuthorSignature("Lewis Caroll", 4.22709528497, 0.111591342227, 0.0537026953444, 16.2728740581, 2.86275565124);
        authors[10] = new AuthorSignature("Mark Twain", 4.33272222298, 0.117254215021, 0.0633074228159, 14.3548573631, 2.43716268311);
        authors[11] = new AuthorSignature("Sir Arthur Conan Doyle", 4.16808311494, 0.0822989796874, 0.0394458485444, 14.717564466, 2.2220872148);
        authors[12] = new AuthorSignature("William Shakespeare", 4.16216957834, 0.105602561171, 0.0575348730848, 9.34707371975, 2.24620146314);
    }
    
    private ArrayList<String> getSentenceFromContents(String fileContents){
        ArrayList<String> result = new ArrayList<String>();
        int last = 0;
        for (int i = 0; i < fileContents.length() - 1; i ++){
            if (fileContents.substring(i, i+1).equals(".") || 
                fileContents.substring(i, i+1).equals("?") || 
                fileContents.substring(i, i+1).equals("!")){
                result.add(fileContents.substring(last + 1, i));
                last = i;
            }
        }
        return result;
    }
     private ArrayList<String> getWordsFromSentence(String sentence)
     {
         ArrayList<String> result = new ArrayList<String>();
         String[] splitSentence = sentence.split(" "); 
         for (int i=0; i<splitSentence.length; i++)
         {
             String cleaned = clean(splitSentence[i]);
             if (cleaned.length() > 0){
                 result.add(cleaned);
             }
         }
         return result;
    }
    private ArrayList<String> getAllWordsFromSetences(ArrayList<String> sentences)
    {
        ArrayList<String> result = new ArrayList<String>();
        for(String sentence: sentences)
        {
             ArrayList<String> a = getWordsFromSentence(sentence);
             for (String word: a){
                 result.add(word);
             }
        }
        return result;
    }
    private String clean(String word)
    {
        word = word.toLowerCase();
        if (word.length() == 0){
            return "";
        }
        while (PUNCTUATION.indexOf(word.substring(0,1)) != -1)
        {
            word = word.substring(1);
            if (word.length() == 0){
                return "";
            }
        }
        while (PUNCTUATION.indexOf(word.substring(word.length()-1)) != -1)
        {
            word = word.substring(0, word.length() - 1);
        }
        return word;
    }
    
    //calculation Methods
    private double computerAverageWordLength(ArrayList<String> words)
    {
        int counter =0; 
        for (String word: words)
        {
            counter+=word.length();
        }
        return (1.0 * counter)/words.size();
    }
    
    private ArrayList<String> getUniqueWords(ArrayList<String> words){

        //fill result arraylist with all unique strings in words
        ArrayList<String> result = new ArrayList<String>();
        for (String word: words){
            if (!result.contains(word)){
                result.add(word);
            }
        }
        return result;
    }
    
    private double computeDifferentWordRatio(ArrayList<String> words){
        //compute ratio of unique words to total words
        ArrayList<String> uniqueWords = getUniqueWords(words);
        return (1.0 * uniqueWords.size())/words.size();
    }
    
    private int frequency(ArrayList<String> words, String word ){
        int counter = 0;
        for (String test : words){
            if (word.equals(test)){
                counter++;
            }
        }
        return counter;
    }

    private double computeHapaxLegomenaRatio(ArrayList<String> words){
        //compute ratio of words that appear only once to total words
        ArrayList<String> uniqueWords = getUniqueWords(words);
        int counter = 0;
        for (String word: uniqueWords){
            if (frequency(words, word) == 1){
                counter++;
            }
        }
        return (1.0 * counter)/words.size();
    }

    private double computeAverageWordsPerSentence(ArrayList<String> sentences){
        //compute average number of words per sentence
        int counter = 0;
        for (String sentence: sentences){
            counter += getWordsFromSentence(sentence).size();
        }
        return (1.0 * counter)/sentences.size();
    }

    public ArrayList<String> getPhrasesFromSentence(String sentence) {
        ArrayList<String> result = new ArrayList<String>();
        int last = 0;
        for (int i = 0; i < sentence.length() - 1; i ++){
            if (sentence.substring(i, i+1).equals(",") ||
                sentence.substring(i, i+1).equals(";") ||
                sentence.substring(i, i+1).equals(":")){
                result.add(sentence.substring(last + 1, i));
                last = i;
            }
        }
        result.add(sentence.substring(last + 1));
        return result;
    }

    private double computeSentenceComplexity(ArrayList<String> sentences){
        //compute average number of phrases per sentence
        int counter = 0;
        for (String sentence: sentences){
            counter += getPhrasesFromSentence(sentence).size();
        }
        return (1.0 * counter)/sentences.size();
    }

}
```