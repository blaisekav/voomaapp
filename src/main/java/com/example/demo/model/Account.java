package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	
@Id	
@GeneratedValue
int Accountid = 0;
String Iban = null;
String BankCode = null;
String CustomerId = null;

public int getAccountid() {
	return Accountid;
}
public void setAccountid(int accountid) {
	Accountid = accountid;
}
public String getIban() {
	return Iban;
}
public void setIban(String iban) {
	Iban = iban;
}
public String getBankCode() {
	return BankCode;
}
public void setBankCode(String bankCode) {
	BankCode = bankCode;
}
public String getCustomerId() {
	return CustomerId;
}
public void setCustomerId(String customerId) {
	CustomerId = customerId;
}

@Override
public String toString() {
	return "Account [Accountid=" + Accountid + ", Iban=" + Iban + ", BankCode=" + BankCode + ", CustomerId="
			+ CustomerId + "]";
}


}
