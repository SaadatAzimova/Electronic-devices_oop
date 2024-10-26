package org.example.electronicdevices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TabPane tabPane;
    @FXML
    private Tab tabSmartphone;
    @FXML
    private Tab tabLaptop;
    @FXML
    private Tab tabTablet;
    @FXML
    private Tab tabMain;
    @FXML
    private ToggleGroup Choise;

    @FXML
    void onCancelClick() {
        tabPane.getSelectionModel().select(tabMain);
    }

    @FXML
    private Button removeButton;
/*all about Smartphonee*/
    //1.radio button
    @FXML
    private RadioButton rbS;
    //2.text fields
    @FXML
    private TextField sName;
    @FXML
    private TextField sPrice;
    @FXML
    private TextField sWeight;
    @FXML
    private TextField sResolution;
    @FXML
    private TextField sScreenSize;
    //3. radio button on action
    @FXML
    void onRbSClick() {
        if (rbS.isSelected()) {
            tabPane.getSelectionModel().select(tabSmartphone);

        }
    }
    //4.adding object to the list
    @FXML
    void onAddSmartphoneClick(){
        Smartphone sm = new Smartphone();
        sm.setType(DeviceType.SMARTPHONE);
        sm.setName(sName.getText());
        sm.setPrice( Double.parseDouble(sPrice.getText()) );
        sm.setWeight( Double.parseDouble( sWeight.getText()) );
        sm.setScreenSize( Double.parseDouble(sScreenSize.getText()) );
        sm.setResolution(Double.parseDouble(sResolution.getText()));
        devices.add(sm);
        //clear text fields after adding the smartphone
        sName.clear();
        sPrice.clear();
        sWeight.clear();
        sScreenSize.clear();
        sResolution.clear();
        //switch to tabMain
        tabPane.getSelectionModel().select(tabMain);
    }

/*all about laptop*/
    //1.radio button
    @FXML
    private RadioButton rbL;
    //2.text fields
    @FXML
    private TextField lName;
    @FXML
    private TextField lPrice;
    @FXML
    private TextField lWeight;
    @FXML
    private TextField lRamSize;
    @FXML
    private TextField lProcessorType;

    //3. radio button on action
    @FXML
    void onRbLClick() {
        if (rbL.isSelected()) {
            tabPane.getSelectionModel().select(tabLaptop);
        }
    }
    //4.adding laptop object
    @FXML
    void onAddLaptopClick(){
        Laptop laptop = new Laptop();
        laptop.setType(DeviceType.LAPTOP);
        laptop.setName(lName.getText());
        laptop.setPrice( Double.parseDouble(lPrice.getText()) );
        laptop.setWeight( Double.parseDouble(lWeight.getText()) );
        laptop.setRamSize(Integer.parseInt(lRamSize.getText()));
        laptop.setProcessorType(lProcessorType.getText());
        devices.add(laptop);
        //clear text fields after adding the laptop
        lName.clear();
        lPrice.clear();
        lWeight.clear();
        lRamSize.clear();
        lProcessorType.clear();
        //switch to tabMain
        tabPane.getSelectionModel().select(tabMain);
    }
/* all about tablet*/
    //1.radio button
    @FXML
    private RadioButton rbT;
    //2.text fields
    @FXML
    private TextField tBatteryLife;
    @FXML
    private TextField tName;
    @FXML
    private TextField tPrice;
    @FXML
    private TextField tWeight;
    @FXML
    private TextField tHasStylus;
//3. radio button on action
    @FXML
    void onRbTClick() {
        if (rbT.isSelected()) {
            tabPane.getSelectionModel().select(tabTablet);
        }
    }
//4.add object to the list
    @FXML
    void onAddTabletClick() {
        Tablet tablet = new Tablet();
        tablet.setType(DeviceType.TABLET);
        tablet.setName(tName.getText());
        tablet.setPrice(Double.parseDouble(tPrice.getText()));
        tablet.setWeight(Double.parseDouble(tWeight.getText()));
        tablet.setBatteryLife(Double.parseDouble(tBatteryLife.getText()));
        tablet.setHasStylus(tHasStylus.getText());
        devices.add(tablet);
        // Clear text fields after adding the Tablet
        tName.clear();
        tPrice.clear();
        tWeight.clear();
        tBatteryLife.clear();
        tHasStylus.clear();
        //switch to tabMain
        tabPane.getSelectionModel().select(tabMain);
    }
//all about list

    @FXML
    private ListView<Device> listView;

    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        listView.setItems(devices);
    }
    @FXML
    private Label label;

    @FXML
    protected void onListClicked(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText(devices.get(id).toString());

    }
    @FXML
    void onRemoveClick() {
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }

}