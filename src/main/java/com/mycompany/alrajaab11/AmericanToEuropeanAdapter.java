/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alrajaab11;

/**
 *
 * @author Adeel
 */
public class AmericanToEuropeanAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void getElectricity() {
        americanPlug.provideElectricity();
    }
}
