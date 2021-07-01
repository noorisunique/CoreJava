package com.instanceOf;

interface MarkerInterface {
}

class IMarkerInterface implements MarkerInterface {

}

public class MyMarkerInterface {
	public static void isMarker(Object object) {
		if (object instanceof IMarkerInterface) {
			System.out.println("Noor");
		}
	}

	public static void main(String[] args) {
		IMarkerInterface i = new IMarkerInterface();
		isMarker(i);
	}

}
