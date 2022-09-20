package com.telran.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestsBase{

    @Test
    public void addReminderWithDefaultDataTest() {
        int quantityBeforAdd;
        int quantityAfterAdd;
        quantityBeforAdd = app.getMainScreen().getTotalReminders();
        //tap on add remeinder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().pause(1000);
        app.getReminders().fillReminderTitle("Test");
        //save reminder
        app.getReminders().saveReminder();
        //assert to add new reminder
        app.getReminders().pause(2000);
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforAdd+1);
    }

    @Test
    public void addReminderWithDefaultDataAndTitleTextAssertTest() {
        //tap on add remeinder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().pause(1000);
        app.getReminders().fillReminderTitle("Test");
        //save reminder
        app.getReminders().saveReminder();
        app.getReminders().pause(2000);
        //assert to add new reminder for title text
        Assert.assertTrue(app.getReminders().isTitleOfReminderPresent());

    }

    @Test
    public void addReminderWithRandomSwipeTest() {
        int quantityBeforAdd;
        int quantityAfterAdd;
        quantityBeforAdd = app.getMainScreen().getTotalReminders();
        //tap on add remeinder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().pause(1000);
        app.getReminders().fillReminderTitle("Test");
        //tap on data field
        app.getReminders().tapOnDataField();
        //choose month
        app.getReminders().pause(500);
        app.getReminders().selectMonth("future");
        //choose day
        app.getReminders().selectDay(19);
        //tap on OK
        app.getReminders().tapOnOk();

        //save reminder
        app.getReminders().saveReminder();
        //assert to add new reminder
        app.getReminders().pause(2000);
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforAdd+1);
    }

    @Test
    public void addReminderWithAllDataTest() {

        int quantityBeforAdd;
        int quantityAfterAdd;
        quantityBeforAdd = app.getMainScreen().getTotalReminders();

        //tap on add remeinder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().pause(1000);
        app.getReminders().fillReminderTitle("Christmas");
        //tap on data field
        app.getReminders().tapOnDataField();
        //choose  certain month
        app.getReminders().selectCertainMonth("future",6,"Dec");
        //select day
        app.getReminders().selectDay(23);
        //tap on year
        app.getReminders().tapOnYear();
        //select year
        app.getReminders().selectYear("past", "2020");
        //tap on OK
        app.getReminders().tapOnOk();
        // tap on time
        app.getReminders().tapOnTime();
        //select time of day
        app.getReminders().pause(500);
        app.getReminders().selectTimeOfDay("am");
        //select hours and minutes
        app.getReminders().pressOnTimer(269, 924);
        app.getReminders().pressOnTimer(539, 1205);
        //tap on OK
        app.getReminders().tapOnOk();
        //switch off repeat
        app.getReminders().tapOnRepeatSwitch();
        //enter repeat number
        app.getReminders().enterRepeatNumber("3");
        //swipe up
        app.getReminders().swipeUp();
        //select repeat time
        app.getReminders().selectRepeatTime("Month");
        //save reminder
        app.getReminders().saveReminder();
        //assert to add new reminder
        app.getReminders().pause(2000);
        //Assert.assertTrue(app.getReminders().isTitleOfReminderPresent());
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforAdd+1);

    }
}
