---
tags:
  - slideshow
---



# Object Detection on Satellite Imaging for Sustainable Water Harvesting Placements in Maasai Region

### Roshan Taneja & Yuvraj Taneja
### Sacred Heart Preparatory School, Atherton

---

## Background and Challenge
* What is the Maasai tribe?
* What problem are they facing?
* Impact of water harvesting on the community

note:
* The Maasai tribe is a semi-nomadic ethnic group in Northern Tanzania and Kenya.
* They face severe water scarcity due to unreliable sources exacerbated by climate change.
* Implementing water harvesting has significantly improved their daily lives, reducing water collection time and enhancing public health.

---

## Goal and Methodology
* What is a boma?
* Our approach

note:
* A boma is a homestead with an outer barrier, shelters, and a smaller circle to hold cattle, housing 10-50 people.
* We aim to map boma locations using satellite images and machine learning for optimal water harvesting unit placements.

---

## Data Collection for Detection
* 2000 photos collected and processed
* 2000 non-boma landscape photos for confirmation

note:
* Photos were cropped, labeled, and multiplied to enhance the dataset.
* Ensuring a balanced dataset between boma and non-boma images is crucial for accuracy.

---

## Training the Model
* Google Earth Engine for plotting bomas
* Training process

note:
* We used the Google Earth Engine to recognize and plot bomas over a set area.
* The model was trained with augmented data to improve detection accuracy.

---

## Results and Accuracy
* Model accuracy and findings

note:
* Initial accuracy was 30% with 2000 boma photos.
* Increased to 93% after augmenting data to 8000 boma photos.
* Model marked coordinates with over 80% confidence in a 250 sq. mile test area.

---

## Conclusions
* Impact and future applications

note:
* AI-driven water resource planning can significantly improve water accessibility for communities like the Maasai.
* Future expansion of this approach can aid in sustainable water management across various regions.

---

## Challenges in the Monduli District
* Rainy and dry seasons' impact on water sources like Nanja Dam

note:
* Nanja Dam, a crucial water source, dries up completely by mid-July, posing a severe challenge for the Maasai community.
* The need for sustainable water solutions is critical for their livelihood.

---

## Day in the Life Before and After Water Harvesting Units
* Activities and improvements in daily life

note:
* Water collection time reduced from 9 to 2-3 hours.
* Increased time for economic, social, and agricultural activities.
* Significant improvement in public health and education.

---

## Techniques Considered for Computer Vision
* YOLOv7, OpenCV, TensorFlow
* Pros and cons of each

note:
* YOLOv7 is optimized for speed and accuracy but has integration challenges.
* OpenCV is accessible and compatible but resource-intensive.
* TensorFlow is highly customizable but complex.

---

## Data Augmentation and Model Training
* Enhanced dataset and training layers

note:
* Resized images, convolution, and pooling layers are essential for accurate detection.
* Enhanced dataset with superimposed boma photos significantly improved model accuracy.

---

## Mapping and Validation
* Green dots indicating Maasai living units

note:
* The map shows precise locations for water unit placements.
* Point density calculations help in strategic deployment for maximum benefit.

---

## Key Observations
* Living patterns and strategic placement

note:
* Dense communities around geological formations and highways.
* AI analysis reveals optimal locations for water units, benefiting large populations.

---

## Conclusion and Future Work
* Expanding AI applications for water resource management

note:
* Leveraging AI for water planning ensures sustainable solutions.
* The approach can be scaled to other regions facing similar challenges, promoting efficient resource allocation.
