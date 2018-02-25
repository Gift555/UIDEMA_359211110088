<?xml version="1.0" encoding="UTF-8"?>

<?import com.jfoenix.controls.JFXButton?>
<?import javafx.scene.control.DatePicker?>
<?import javafx.scene.control.Tab?>
<?import javafx.scene.control.TabPane?>
<?import javafx.scene.control.TableColumn?>
<?import javafx.scene.control.TableView?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="700.0" xmlns="http://javafx.com/javafx/8.0.141" xmlns:fx="http://javafx.com/fxml/1" fx:controller="Admin.adminController">
<children>
<TabPane prefHeight="400.0" prefWidth="700.0" tabClosingPolicy="UNAVAILABLE">
<tabs>
<Tab text="Student Data">
<content>
<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="400.0" prefWidth="567.0" style="-fx-background-color: #212121;">
<children>
<TableView fx:id="studentTable" layoutX="205.0" layoutY="42.0" prefHeight="294.0" prefWidth="479.0">
<columns>
<TableColumn fx:id="idcolum" prefWidth="39.0" text="ID" />
<TableColumn fx:id="firstnamecolum" prefWidth="102.0" text="Firstname" />
<TableColumn fx:id="lastnamecolum" prefWidth="102.0" text="Lastname" />
<TableColumn fx:id="emailcolum" prefWidth="152.0" text="Email" />
<TableColumn fx:id="dobcolum" prefWidth="83.0" text="Date of Birth" />
</columns>
</TableView>
<JFXButton fx:id="btnLoad" layoutX="604.0" layoutY="7.0" onAction="#loadStudentData" ripplerFill="#e80808" style="-fx-background-color: #458af9;" text="Load Data">
<font>
<Font name="System Bold" size="13.0" />
</font>
</JFXButton>
<TextField fx:id="searchTxt" layoutX="205.0" layoutY="9.0" prefHeight="25.0" prefWidth="246.0" promptText="Search">
<font>
<Font size="13.0" />
</font>
</TextField>
<TextField fx:id="id" layoutX="48.0" layoutY="42.0" promptText="ID" />
<TextField fx:id="fname" layoutX="48.0" layoutY="74.0" promptText="Fitst Name" />
<TextField fx:id="lname" layoutX="48.0" layoutY="106.0" promptText="Last Name" />
<TextField fx:id="email" layoutX="48.0" layoutY="138.0" promptText="Email" />
<DatePicker fx:id="dob" layoutX="49.0" layoutY="173.0" prefHeight="25.0" prefWidth="148.0" promptText="Date of Birth" />
<JFXButton fx:id="btnAdd" layoutX="49.0" layoutY="212.0" prefHeight="25.0" prefWidth="147.0" style="-fx-background-color: #458af9;" text="Add Student">
<font>
<Font name="System Bold" size="12.0" />
</font>
</JFXButton>
<JFXButton fx:id="btnEdit" layoutX="49.0" layoutY="244.0" prefHeight="25.0" prefWidth="147.0" style="-fx-background-color: #458af9;" text="Edit Student">
<font>
<Font name="System Bold" size="12.0" />
</font>
</JFXButton>
<JFXButton fx:id="btnDelete" layoutX="49.0" layoutY="276.0" prefHeight="25.0" prefWidth="147.0" style="-fx-background-color: #458af9;" text="Delete Student">
<font>
<Font name="System Bold" size="12.0" />
</font>
</JFXButton>
</children>
</AnchorPane>
</content>
</Tab>
<Tab text="Help?">
<content>
<AnchorPane minHeight="0.0" minWidth="0.0" prefHeight="180.0" prefWidth="200.0" style="-fx-background-color: #212121;" />
</content>
</Tab>
</tabs>
</TabPane>
</children>
</AnchorPane>