public class Space{
public String ourGalaxy;
public int planets;
public String bigStar;
public boolean limitless;
public char ourPlanet;
public short noOfsattelite;
public long  distance;

public Space(){
System.out.println("space has so many galaxies");
}
public Space(String ourGalaxy){
this.ourGalaxy=ourGalaxy;
System.out.println("ourGalaxy:"+ourGalaxy);
}
public Space(String ourGalaxy,int planets){
this.ourGalaxy=ourGalaxy;
this.planets=planets;
System.out.println("ourGalaxy:"+ourGalaxy+" "+"planets:"+planets);
}
public Space(String ourGalaxy,int planets,String bigStar){
this.ourGalaxy=ourGalaxy;
this.planets=planets;
this.bigStar=bigStar;
System.out.println("ourGalaxy:"+ourGalaxy+" "+"planets:"+planets+" "+"bigStar:"+bigStar);
}
public Space(String ourGalaxy,int planets,String bigStar,boolean limitless){
this.ourGalaxy=ourGalaxy;
this.planets=planets;
this.bigStar=bigStar;
this.limitless=limitless;
System.out.println("ourGalaxy:"+ourGalaxy+" "+"planets:"+planets+" "+"bigStar:"+bigStar+" "+"limitless:"+limitless);
}
public Space(String ourGalaxy,int planets,String bigStar,boolean limitless,char ourPlanet){
this.ourGalaxy=ourGalaxy;
this.planets=planets;
this.bigStar=bigStar;
this.limitless=limitless;
this.ourPlanet=ourPlanet;
System.out.println("ourGalaxy:"+ourGalaxy+" "+"planets:"+planets+" "+"bigStar:"+bigStar+" "+"limitless:"+limitless+" "+"ourPlanet:"+ourPlanet);
}
public Space(String ourGalaxy,int planets,String bigStar,boolean limitless,char ourPlanet,short noOfsattelite){
this.ourGalaxy=ourGalaxy;
this.planets=planets;
this.bigStar=bigStar;
this.limitless=limitless;
this.ourPlanet=ourPlanet;
this.noOfsattelite=noOfsattelite;
System.out.println("ourGalaxy:"+ourGalaxy+" "+"planets:"+planets+" "+"bigStar:"+bigStar+" "+"limitless:"+limitless+" "+"ourPlanet:"+ourPlanet+" "+"noOfsattelite:"+noOfsattelite);
}
public Space(String ourGalaxy,int planets,String bigStar,boolean limitless,char ourPlanet,short noOfsattelite,long distance){
this.ourGalaxy=ourGalaxy;
this.planets=planets;
this.bigStar=bigStar;
this.limitless=limitless;
this.ourPlanet=ourPlanet;
this.noOfsattelite=noOfsattelite;
this.distance=distance;
System.out.println("ourGalaxy:"+ourGalaxy+" "+"planets:"+planets+" "+"bigStar:"+bigStar+" "+"limitless:"+limitless+" "+"ourPlanet:"+ourPlanet+" "+"noOfsattelite:"+noOfsattelite+" "+"distance:"+distance);
}
}