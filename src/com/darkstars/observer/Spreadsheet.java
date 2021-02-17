package com.darkstars.observer;

public class Spreadsheet implements Observer {
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet got updated: " + dataSource.getValue());
    }
}
