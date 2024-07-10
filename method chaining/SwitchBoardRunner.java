public class SwitchBoardRunner{
public static void main(String [] args){
SwitchBoard.holes="switch";
SwitchBoard.button=6;
SwitchBoard.wires=3;
SwitchBoard.socket=2;
SwitchBoard.initial='S';
SwitchBoard.current=3.3;
SwitchBoard.nuts=8;
SwitchBoard.madeUpOf="wood";
SwitchBoard.regulatorRange=5;

System.out.println("SwitchBoard details are:"+SwitchBoard.holes);
System.out.println("SwitchBoard details are:"+SwitchBoard.button);
System.out.println("SwitchBoard details are:"+SwitchBoard.wires);
System.out.println("SwitchBoard details are:"+SwitchBoard.socket);
System.out.println("SwitchBoard details are:"+SwitchBoard.initial);
System.out.println("SwitchBoard details are:"+SwitchBoard.current);

System.out.println("SwitchBoard details are:"+SwitchBoard.nuts);

System.out.println("SwitchBoard details are:"+SwitchBoard.madeUpOf);

System.out.println("SwitchBoard details are:"+SwitchBoard.regulatorRange);

}

}