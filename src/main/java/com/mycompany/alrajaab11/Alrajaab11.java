/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.alrajaab11;

//https://github.com/SilverCyclon/M11.git << Repository URL?


/**
 *
 * @author Adeel
 */
public class Alrajaab11 {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPowerPlug();
        EuropeanSocket europeanSocket = new EuropeanPowerSocket();

        AmericanToEuropeanAdapter adapter = new AmericanToEuropeanAdapter(americanPlug);
        adapter.getElectricity(); // This should output "American power plug is providing electricity."
    }
}
