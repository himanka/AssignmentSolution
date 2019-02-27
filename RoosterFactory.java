package com.solution;

public class RoosterFactory {
	
	
	static RoosterPoc getRoosterByLanguage(String language){
		
		switch(language){
		case "Danish":
			return new RoosterPoc("kykyliky");
		case "Dutch":
			return new RoosterPoc("kukeleku");
		case "Finnish":
			return new RoosterPoc("kukko kiekuu");
		case "French":
			return new RoosterPoc("cocorico");
		case "German":
			return new RoosterPoc("kikeriki");
		case "Greek":
			return new RoosterPoc("kikiriki");
		case "Hebrew":
			return new RoosterPoc("coo-koo-ri-koo");
		case "Hungarian":
			return new RoosterPoc("kukuriku");
		case "Italian":
			return new RoosterPoc("chicchirichi");
		case "Japanese":
			return new RoosterPoc("ko-ke-kok-ko-o");
		case "Portuguese":
			return new RoosterPoc("cucurucu");
		case "Russian":
			return new RoosterPoc("kukareku");		
		case "Swedish":
			return new RoosterPoc("kuckeliku");
		case "Turkish":
			return new RoosterPoc("kuk-kurri-kuuu");
		case "Urdu":
			return new RoosterPoc("kuklooku");
		}
		return null;
	}
	
	
}
