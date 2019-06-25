package com.cvaleriano.cuso.local;

import java.util.Locale;

/**
 * @author cvaleriano
 *
 */
public class LocalExample {
	
	public static void main(String[] args) {
		// Creates a locale object using one parameter to constructor
        Locale locale = new Locale("fr");   
        System.out.println("locale: "+locale);
         
        // Create a locale object using two parameters constructor
        Locale locale2 = new Locale("fr", "CANADA");
        System.out.println("locale2: "+locale2);
         
        // Create a locale object using three parameters constructor
        Locale locale3 = new Locale("no", "NORWAY", "NY");
        System.out.println("locale3: "+locale3);
         
        // A local object from Locale.Builder
        Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        System.out.println("localeFromBuilder: "+localeFromBuilder);
         
        //Locale from forLanguageTag method
        Locale forLangLocale = Locale.forLanguageTag("en-GB");
        System.out.println("forLangLocale: "+forLangLocale);
         
        //Using Locale Contant
        Locale localeCosnt = Locale.FRANCE;
        System.out.println("localeCosnt: "+localeCosnt);
        
        methodsLocal();
	}
	
	private static void methodsLocal() {
		System.out.println("****************************************************************");
		// Getting a default locale object
        Locale locale = Locale.getDefault();
        System.out.println("Default Locale: "+locale);
         
        // Getting all available locales from current instance of the JVM
        Locale []availableLocale = Locale.getAvailableLocales();
        for(Locale aLocale : availableLocale){
            System.out.println("Name of Locale: "+aLocale.getDisplayName());
            System.out.println("Language Code: "+aLocale.getLanguage()+", Language Display Name: "+aLocale.getDisplayLanguage());
            System.out.println("Country Code: "+aLocale.getCountry()+", Country Display Name: "+aLocale.getDisplayCountry());
            if(!aLocale.getScript().equals("")){
                System.out.println("Script Code: "+aLocale.getScript()+", Script Display Name: "+aLocale.getDisplayScript());
            }
            if(!aLocale.getVariant().equals("")){
                System.out.println("Variant Code: "+aLocale.getVariant()+", Variant Display Name: "+aLocale.getDisplayVariant());
            }
            System.out.println("****************************************************************");
        }
	}

}
