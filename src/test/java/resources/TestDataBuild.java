package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	public AddPlace addplacePayload() {
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setAddress("29, side layout, cohen 90");
		p.setLanguage("French-IN");
		p.setPhone_number("(+91) 6394127923");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName("Frontline House");
		p.setLocation(1);

		List<String> mylist = new ArrayList<String>();
		mylist.add("shoe Park");
		mylist.add("shop");

		p.setTypes(mylist);

		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		return p;

	}

}
