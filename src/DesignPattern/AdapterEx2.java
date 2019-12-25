package DesignPattern;

interface IPhone {
	public void charse();
}

interface AndroidPhone {
	public void charse();
}

class OnePlus5 implements AndroidPhone {
	public void charse() {
		System.out.println("charging OnePlus");
	}
}

class IPhoneX implements IPhone {
	public void charse() {
		System.out.println("charging IPhoneX");
	}
}

class IPhoneCharger {
	public void charge(IPhone iPhone) {
		iPhone.charse();
	}
}

class AndoidCharger {
	public void charge(AndroidPhone androidPhone) {
		androidPhone.charse();
	}
}

class AndroidToIPhoneAdapter implements IPhone {
	private AndroidPhone androidPhone;

	public AndroidToIPhoneAdapter(AndroidPhone androidPhone) {
		this.androidPhone = androidPhone;
	}

	@Override
	public void charse() {
		androidPhone.charse();

	}
}

public class AdapterEx2 {

	public static void main(String[] args) {
		AndoidCharger andoidCharger = new AndoidCharger();
		AndroidPhone androidPhone = new OnePlus5();
		andoidCharger.charge(androidPhone);

		IPhoneCharger iPhoneCharger = new IPhoneCharger();
		IPhone iPhone = new IPhoneX();
		iPhoneCharger.charge(iPhone);

		AndroidToIPhoneAdapter androidToIPhoneAdapter = new AndroidToIPhoneAdapter(androidPhone);
		iPhoneCharger.charge(androidToIPhoneAdapter);
	}

}
