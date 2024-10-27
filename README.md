How It Works:

1.Device Types and Inheritance:
  Each device type (Smartphone, Laptop, Tablet) inherits from a base Device class, ensuring shared attributes and methods.
  Specific attributes, such as screenSize for Smartphone or hasStylus for Tablet, are defined in their respective subclasses.

2.Graphical Interface:
A TabPane with separate tabs for each device type guides the user through adding specific device information.
Text fields allow entry of details like name, price, weight, and other specific characteristics per device type.

3.Observable List and ListView:
The application maintains an ObservableList of devices, ensuring changes in the list (additions or removals) automatically reflect in the UI.
A ListView displays all added devices, and users can select any device to view details or remove it from the list.

4.Device Actions:
Add: Adds a device to the list after filling in the relevant information for that device type.
Remove: Removes the selected device from the list and displays a confirmation message.

How to Use the Application

1.Starting the Application:
Launch the application, and the main screen with device type selection tabs will appear.

2.Adding Devices:
Select a device type by clicking on one of the radio buttons for "Smartphone," "Laptop," or "Tablet." This action opens the corresponding tab.
Enter details for the selected device in the provided fields:
Smartphone: Name, Price, Weight, Screen Size, Camera Resolution.
Laptop: Name, Price, Weight, RAM Size, Processor Type.
Tablet: Name, Price, Weight, Battery Life, Has Stylus (enter "true" or "false").
Click the Add button to save the device information. The device is added to the ListView on the main tab, and fields are cleared for the next entry.

3.Viewing and Removing Devices:
Select any device from the ListView to see its details displayed in the label below.
To remove a device, click on it in the ListView and then press the Remove button. A message will display confirming the removal.

4.Navigation:
Use the Cancel button at any time to return to the main tab from any specific device tab.

Screenshots:
1. start
   
   ![d1](https://github.com/user-attachments/assets/054946fa-6a0a-4e96-aa2c-db2452e79fee)
2. Selecting Smartphone rsdio button (switches to Smartphone tab)
  ![d2](https://github.com/user-attachments/assets/929fde94-474d-4097-b415-49feb075cfc9)
3. Filling Smartphone tet fields
   ![d3](https://github.com/user-attachments/assets/3ec2ff3a-7dd8-48cf-9ae1-59c4e30bb4a3)
4. clicking on "Add" button (switches to main tab, object added to the list, smartphone text fields cleared)
   ![d4](https://github.com/user-attachments/assets/c5f9fed6-732e-429f-8484-7461065bb522)
5. Selecting laptop radio button (switches to laptop tab)
   ![d5](https://github.com/user-attachments/assets/7c56c831-e189-4057-820c-6f3e91cd738a)
6. filling laptop textfield
   
   ![d6](https://github.com/user-attachments/assets/aad6422e-2b5e-4653-a4b4-a618f4cddc4c)
   
7.clicking on "Add" button (switches to main tab, object added to the list, laptop text fields cleared)
  ![d7](https://github.com/user-attachments/assets/033f2948-0c0e-4e71-ac6c-c0446876fed7)

8. selecting TAblet radio button (switches to tablet tab)
   ![d8](https://github.com/user-attachments/assets/fe7b3b4c-869d-4224-99e0-ff7a62fc8be0)

9. Filling tablet text fields
    ![d9](https://github.com/user-attachments/assets/db31b770-7cd9-4976-b170-164c6e862dd2)

10. clicking on "Add" button (switches to main tab, object added to the list, tablet text fields cleared)
    ![d10](https://github.com/user-attachments/assets/fe42573e-4a12-4f4c-b79e-4bdc00ada7e2)

11.  clicking on object in listview
  ![d11](https://github.com/user-attachments/assets/d0e84947-21a4-4efb-ba2e-eac2ce44bd92)

12. removing object from the list
    ![d12](https://github.com/user-attachments/assets/2ffca5c4-1705-4a43-ba15-012ec6d7ec7f)

  









