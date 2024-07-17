public class ChargerRunner{
	public static void main(String []args){
	Charger.sizes=6;
	Charger.capacitys=2;
	Charger.chargerNames="samsung";
	Charger.companyNames="samsung";
	Charger.cell=9;
	Charger.capacitors=3000;//mh
	Charger.noOfChargers=80;
	Charger.noOfPlug=4;
	Charger.serialNums=987654567L;
	Charger.qrNums=1237885434L;
	Charger.initials='C';
	Charger.types='b';
	
	System.out.println("charger size:"+Charger.sizes);
System.out.println("charger capacity:"+Charger.capacitys);
System.out.println("charger name:"+Charger.chargerNames);
System.out.println("charger companyName:"+Charger.companyNames);
System.out.println("charger cell:"+Charger.cell);
System.out.println("charger capacitor"+Charger.capacitors);//mh
System.out.println("no of charger:"+Charger.noOfChargers);
System.out.println("no of plugs:"+Charger.noOfPlug);
System.out.println("serial num:"+Charger.serialNums);

System.out.println("qr num:"+Charger.qrNums);

System.out.println("initial:"+Charger.initials);

System.out.println("type:"+Charger.types);
	
	
new Charger();

Charger chargers=new Charger();
System.out.println("chargers:"+chargers);

chargers.size=4;
chargers.capacity=5;
chargers.chargerName="mi";
chargers.companyName="mi";
chargers.cells=8;
chargers.capacitor=6000;
chargers.noOfCharger=5;
chargers.noOfPlugs=2;
chargers.serialNum=87654456787L;
chargers.qrNum=876534567L;
chargers.initial='m';
chargers.type='c';

System.out.println("charger size:"+chargers.size);
System.out.println("charger capacity:"+chargers.capacity);
System.out.println("charger name:"+chargers.chargerName);
System.out.println("charger companyName:"+chargers.companyName);
System.out.println("charger cell:"+chargers.cells);
System.out.println("charger capacitor"+chargers.capacitor);//mh
System.out.println("no of charger:"+chargers.noOfCharger);
System.out.println("no of plugs:"+chargers.noOfPlugs);
System.out.println("serial num:"+chargers.serialNum);

System.out.println("qr num:"+chargers.qrNum);

System.out.println("initial:"+chargers.initial);

System.out.println("type:"+chargers.type);


Charger chargers1=new Charger();
System.out.println("chargers:"+chargers);

chargers1.size=4;
chargers1.capacity=5;
chargers1.chargerName="mi";
chargers1.companyName="mi";
chargers1.cells=8;
chargers1.capacitor=6000;
chargers1.noOfCharger=5;
chargers1.noOfPlugs=2;
chargers1.serialNum=87654456787L;
chargers1.qrNum=876534567L;
chargers1.initial='m';
chargers1.type='c';

System.out.println("charger size:"+chargers1.size);
System.out.println("charger capacity:"+chargers1.capacity);
System.out.println("charger name:"+chargers1.chargerName);
System.out.println("charger companyName:"+chargers1.companyName);
System.out.println("charger cell:"+chargers1.cells);
System.out.println("charger capacitor"+chargers1.capacitor);//mh
System.out.println("no of charger:"+chargers1.noOfCharger);
System.out.println("no of plugs:"+chargers1.noOfPlugs);
System.out.println("serial num:"+chargers1.serialNum);

System.out.println("qr num:"+chargers1.qrNum);

System.out.println("initial:"+chargers1.initial);

System.out.println("type:"+chargers1.type);
}
}