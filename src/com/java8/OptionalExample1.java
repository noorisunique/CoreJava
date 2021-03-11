package com.java8;

import java.util.Optional;
//https://mkyong.com/java8/java-8-optional-in-depth/
//Life before Optional
/*private void getIsoCode( User user){
    if (user != null) {
        Address address = user.getAddress();
        if (address != null) {
            Country country = address.getCountry();
            if (country != null) {
                String isocode = country.getIsocode();
                if (isocode != null) {
                    isocode = isocode.toUpperCase();
                }
            }
        }
    }
}*/

public class OptionalExample1 {

	public static void main(String[] args) {
		String a ="";
		Optional<String> o1 = Optional.of(a);
		System.out.println(o1.isPresent());
		System.out.println(o1.empty().get());
		System.out.println(o1.ofNullable(a).get());

	}

}
