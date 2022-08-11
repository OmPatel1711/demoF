/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author ompat
 */
public enum suit {
        HEART("♥"),
	SPREAD("♠"),
	DIAMOND("♦"),
	CLUB("♣");
	
	private final String value;
	suit(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}