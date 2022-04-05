package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
int CardId = 0;
@Column(name="Accountid", unique=true)
int Accountid = 0;
String CardAlias = null;
String CardType = null;

public int getCardId() {
	return CardId;
}
public void setCardId(int cardId) {
	CardId = cardId;
}
public int getAccountid() {
	return Accountid;
}
public void setAccountid(int accountid) {
	Accountid = accountid;
}
public String getCardAlias() {
	return CardAlias;
}
public void setCardAlias(String cardAlias) {
	CardAlias = cardAlias;
}
public String getCardType() {
	return CardType;
}
public void setCardType(String cardType) {
	CardType = cardType;
}

@Override
public String toString() {
	return "Card [CardId=" + CardId + ", Accountid=" + Accountid + ", CardAlias=" + CardAlias + ", CardType=" + CardType
			+ "]";
}





}


