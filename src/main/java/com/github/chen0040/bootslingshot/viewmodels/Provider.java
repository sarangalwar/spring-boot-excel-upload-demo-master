package com.github.chen0040.bootslingshot.viewmodels;


import lombok.Getter;
import lombok.Setter;

import java.util.*;

/**
 * Created by xschen on 24/6/2017.
 */
@Getter
@Setter
public class Provider {
   private static Random random = new Random();

   private String npi;

   private String tin;

   private String modelType;
   
   private String validThroughDate;
   
   private String error;
   
   public Provider() {

   }



   public Provider(String npi, String tin, String modelType, String validThroughDate, String error) {
	//super();
	this.npi = npi;
	this.tin = tin;
	this.modelType = modelType;
	this.validThroughDate = validThroughDate;
	this.error = error;
}
   



@Override
public String toString() {
	return "Provider [npi=" + npi + ", tin=" + tin + ", modelType=" + modelType + ", validThroughDate="
			+ validThroughDate + ", error=" + error + "]";
}



public static Provider createAlert(String errorMessage) {
      Provider product = new Provider();
      return product.alert(errorMessage);
   }

   public Provider alert(String errorMessage) {
      error = errorMessage;
      return this;
   }

public static Random getRandom() {
	return random;
}

public static void setRandom(Random random) {
	Provider.random = random;
}



public String getNpi() {
	return npi;
}



public void setNpi(String npi) {
	this.npi = npi;
}



public String getTin() {
	return tin;
}



public void setTin(String tin) {
	this.tin = tin;
}



public String getModelType() {
	return modelType;
}



public void setModelType(String modelType) {
	this.modelType = modelType;
}



public String getValidThroughDate() {
	return validThroughDate;
}



public void setValidThroughDate(String validThroughDate) {
	this.validThroughDate = validThroughDate;
}



public String getError() {
	return error;
}



public void setError(String error) {
	this.error = error;
}


}
