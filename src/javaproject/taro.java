package javaproject;
import java.util.*;
public class taro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int yorn = 0;
		int a = 0, b=0,c=0;
		int d = 0;
		int rdnu = 0;
		
		System.out.println("타로점을 받으시곘습니까? YES(1) NO(2)");
	
		try {//정수 말고 문자입력하는거 잡기
			yorn = sc.nextInt();//Yes Or No 받기}
			if(yorn>2) {//1이나2아니면 잡기{
				System.out.println("1,2만 입력해 주세요");
				System.out.println("타로점을 받으시곘습니까? YES(1) NO(2) 이번에도 말안들으면 그냥 종료입니다.");
				yorn = sc.nextInt();
				
				}
			}
	
		catch(InputMismatchException e) {
			System.out.println("정수를 입력하셔야죠~");
			
	}
		

		Random rd = new Random();
		
		a=rd.nextInt(22);//카드 3장 랜덤뽑기
		b=rd.nextInt(22);
		c=rd.nextInt(22);
		
		for(int i = 0;i<5;i++) {//카드가 겹치면 다시 뽑기
			if(a==b) {
				b=rd.nextInt(22);
			}
		}
		
		
		for(int h = 0;h<5;h++) {//카드가 겹치면 다시 뽑기<
			
			if(a==c||b==c) {
				c=rd.nextInt(22);
			}
		}
		if(yorn==1) //대답이 yes이면 실행
		for(int ka = 0;ka<=2;ka++) {//과거 현재 미래 순으로 출력
			if(ka==0) {
				d=rd.nextInt(2);//카드 정, 역방향 정하기
				rdnu=a;
				System.out.println("과거");
			}
			else if(ka==1) {
				d=rd.nextInt(2);
				rdnu=b;
				System.out.println("현재");
			}
			else if(ka==2) {
				d=rd.nextInt(2);
				rdnu=c;
				System.out.println("미래");
			}
			do {
				if(yorn==1) {
					switch(rdnu) {//case에 각 카드 번호를 입력하면 카드를 찾아감
						case 0:
							if(d==0) {
								TheFool TheFool = new TheFool();
		
								System.out.println("카드이름 : "+TheFool.getName());
								System.out.println("카드해석 : "+TheFool.getTrans());
								System.out.println("금전운 : "+TheFool.getMoney());
								System.out.println("연애운 : "+TheFool.getLove());
								System.out.println("건강운 : "+TheFool.getHealth());
								System.out.println("직업운 : "+TheFool.getCareer());
							
						}
							else if(d==1) {
								RTheFool RTheFool = new RTheFool();
								System.out.println("카드이름 : "+RTheFool.getName());
								System.out.println("카드해석 : "+RTheFool.getTrans());
								System.out.println("금전운 : "+RTheFool.getMoney());
								System.out.println("연애운 : "+RTheFool.getLove());
								System.out.println("건강운 : "+RTheFool.getHealth());
								System.out.println("직업운 : "+RTheFool.getCareer());
								
							}
							break;
						case 1:
							if(d==0) {
								TheMagician Themagic = new TheMagician();
								System.out.println("카드이름 : "+Themagic.getName());
								System.out.println("카드해석 : "+Themagic.getTrans());
								System.out.println("금전운 : "+Themagic.getMoney());
								System.out.println("연애운 : "+Themagic.getLove());
								System.out.println("건강운 : "+Themagic.getHealth());
								System.out.println("직업운 : "+Themagic.getCareer());
								
							}
							else if(d==1) {
								RTheMagician RThemagic = new RTheMagician();
								System.out.println("카드이름 : "+RThemagic.getName());
								System.out.println("카드해석 : "+RThemagic.getTrans());
								System.out.println("금전운 : "+RThemagic.getMoney());
								System.out.println("연애운 : "+RThemagic.getLove());
								System.out.println("건강운 : "+RThemagic.getHealth());
								System.out.println("직업운 : "+RThemagic.getCareer());
								
							}
							break;
						case 2:
							if(d==0) {
								TheHighPriestess TheHighPri = new TheHighPriestess();
								System.out.println("카드이름 : "+TheHighPri.getName());
								System.out.println("카드해석 : "+TheHighPri.getTrans());
								System.out.println("금전운 : "+TheHighPri.getMoney());
								System.out.println("연애운 : "+TheHighPri.getLove());
								System.out.println("건강운 : "+TheHighPri.getHealth());
								System.out.println("직업운 : "+TheHighPri.getCareer());
								
							}
							else if(d==1) {
								RTheHighPriestess RTheHighPri = new RTheHighPriestess();
								System.out.println("카드이름 : "+RTheHighPri.getName());
								System.out.println("카드해석 : "+RTheHighPri.getTrans());
								System.out.println("금전운 : "+RTheHighPri.getMoney());
								System.out.println("연애운 : "+RTheHighPri.getLove());
								System.out.println("건강운 : "+RTheHighPri.getHealth());
								System.out.println("직업운 : "+RTheHighPri.getCareer());
								}
							break;
						case 3:
							
	
							if(d==0) {
								TheEmpress Empers  = new TheEmpress();
								
								System.out.println("카드이름 : "+Empers.getName());
								System.out.println("카드해석 : "+Empers.getTrans());
								System.out.println("금전운 : "+Empers.getMoney());
								System.out.println("연애운 : "+Empers.getLove());
								System.out.println("건강운 : "+Empers.getHealth());
								System.out.println("직업운 : "+Empers.getCareer());
							}
							else if(d==1) {
								RTheEmpress REmpers  = new RTheEmpress();
								
								System.out.println("카드이름 : "+REmpers.getName());
								System.out.println("카드해석 : "+REmpers.getTrans());
								System.out.println("금전운 : "+REmpers.getMoney());
								System.out.println("연애운 : "+REmpers.getLove());
								System.out.println("건강운 : "+REmpers.getHealth());
								System.out.println("직업운 : "+REmpers.getCareer());
							}
							break;
						case 4:
							
							
							if(d==0) {
								TheEmperor Emper  = new TheEmperor();
								System.out.println("카드이름 : "+Emper.getName());
								System.out.println("카드해석 : "+Emper.getTrans());
								System.out.println("금전운 : "+Emper.getMoney());
								System.out.println("연애운 : "+Emper.getLove());
								System.out.println("건강운 : "+Emper.getHealth());
								System.out.println("직업운 : "+Emper.getCareer());
							}
							else if(d==1) {
								RTheEmperor REmper  = new RTheEmperor();
								System.out.println("카드이름 : "+REmper.getName());
								System.out.println("카드해석 : "+REmper.getTrans());
								System.out.println("금전운 : "+REmper.getMoney());
								System.out.println("연애운 : "+REmper.getLove());
								System.out.println("건강운 : "+REmper.getHealth());
								System.out.println("직업운 : "+REmper.getCareer());
							}
							break;
						case 5:
							
							if(d==0) {
								TheHierophant Hiero = new TheHierophant();
								System.out.println("카드이름 : "+Hiero.getName());
								System.out.println("카드해석 : "+Hiero.getTrans());
								System.out.println("금전운 : "+Hiero.getMoney());
								System.out.println("연애운 : "+Hiero.getLove());
								System.out.println("건강운 : "+Hiero.getHealth());
								System.out.println("직업운 : "+Hiero.getCareer());
							}
							else if(d==1) {
								RTheHierophant RHiero = new RTheHierophant();
								System.out.println("카드이름 : "+RHiero.getName());
								System.out.println("카드해석 : "+RHiero.getTrans());
								System.out.println("금전운 : "+RHiero.getMoney());
								System.out.println("연애운 : "+RHiero.getLove());
								System.out.println("건강운 : "+RHiero.getHealth());
								System.out.println("직업운 : "+RHiero.getCareer());
							}
							break;
						case 6:
							
							if(d==0) {
								TheLovers loves = new TheLovers();
								System.out.println("카드이름 : "+loves.getName());
								System.out.println("카드해석 : "+loves.getTrans());
								System.out.println("금전운 : "+loves.getMoney());
								System.out.println("연애운 : "+loves.getLove());
								System.out.println("건강운 : "+loves.getHealth());
								System.out.println("직업운 : "+loves.getCareer());
							}
							else if(d==1) {
								RTheLovers Rloves = new RTheLovers();
								System.out.println("카드이름 : "+Rloves.getName());
								System.out.println("카드해석 : "+Rloves.getTrans());
								System.out.println("금전운 : "+Rloves.getMoney());
								System.out.println("연애운 : "+Rloves.getLove());
								System.out.println("건강운 : "+Rloves.getHealth());
								System.out.println("직업운 : "+Rloves.getCareer());
							}
							break;
						case 7:
							

							if(d==0) {
								TheChariot Chari = new TheChariot();
								System.out.println("카드이름 : "+Chari.getName());
								System.out.println("카드해석 : "+Chari.getTrans());
								System.out.println("금전운 : "+Chari.getMoney());
								System.out.println("연애운 : "+Chari.getLove());
								System.out.println("건강운 : "+Chari.getHealth());
								System.out.println("직업운 : "+Chari.getCareer());
							}
							else if(d==1) {
								RTheChariot RChari = new RTheChariot();
								System.out.println("카드이름 : "+RChari.getName());
								System.out.println("카드해석 : "+RChari.getTrans());
								System.out.println("금전운 : "+RChari.getMoney());
								System.out.println("연애운 : "+RChari.getLove());
								System.out.println("건강운 : "+RChari.getHealth());
								System.out.println("직업운 : "+RChari.getCareer());
							}
							break;
						case 8:
							

							if(d==0) {
								Strength Str = new Strength();
								System.out.println("카드이름 : "+Str.getName());
								System.out.println("카드해석 : "+Str.getTrans());
								System.out.println("금전운 : "+Str.getMoney());
								System.out.println("연애운 : "+Str.getLove());
								System.out.println("건강운 : "+Str.getHealth());
								System.out.println("직업운 : "+Str.getCareer());
							}
							else if(d==1) {
								RStrength RStr = new RStrength();
								System.out.println("카드이름 : "+RStr.getName());
								System.out.println("카드해석 : "+RStr.getTrans());
								System.out.println("금전운 : "+RStr.getMoney());
								System.out.println("연애운 : "+RStr.getLove());
								System.out.println("건강운 : "+RStr.getHealth());
								System.out.println("직업운 : "+RStr.getCareer());
							}
							break;
						case 9:
							

							if(d==0) {
								TheHermit TheHerm = new TheHermit();
								System.out.println("카드이름 : "+TheHerm.getName());
								System.out.println("카드해석 : "+TheHerm.getTrans());
								System.out.println("금전운 : "+TheHerm.getMoney());
								System.out.println("연애운 : "+TheHerm.getLove());
								System.out.println("건강운 : "+TheHerm.getHealth());
								System.out.println("직업운 : "+TheHerm.getCareer());
							}
							else if(d==1) {
								RTheHermit RTheHerm = new RTheHermit();
								System.out.println("카드이름 : "+RTheHerm.getName());
								System.out.println("카드해석 : "+RTheHerm.getTrans());
								System.out.println("금전운 : "+RTheHerm.getMoney());
								System.out.println("연애운 : "+RTheHerm.getLove());
								System.out.println("건강운 : "+RTheHerm.getHealth());
								System.out.println("직업운 : "+RTheHerm.getCareer());
							}
							break;
						case 10:
							

							if(d==0) {
								WheelOfFortune Wheelof = new WheelOfFortune();
								System.out.println("카드이름 : "+Wheelof.getName());
								System.out.println("카드해석 : "+Wheelof.getTrans());
								System.out.println("금전운 : "+Wheelof.getMoney());
								System.out.println("연애운 : "+Wheelof.getLove());
								System.out.println("건강운 : "+Wheelof.getHealth());
								System.out.println("직업운 : "+Wheelof.getCareer());
							}
							else if(d==1) {
								RWheelOfFortune RWheelof = new RWheelOfFortune();
								System.out.println("카드이름 : "+RWheelof.getName());
								System.out.println("카드해석 : "+RWheelof.getTrans());
								System.out.println("금전운 : "+RWheelof.getMoney());
								System.out.println("연애운 : "+RWheelof.getLove());
								System.out.println("건강운 : "+RWheelof.getHealth());
								System.out.println("직업운 : "+RWheelof.getCareer());
							}
							break;
						case 11:
							

							if(d==0) {
								Justice Just = new Justice();
								System.out.println("카드이름 : "+Just.getName());
								System.out.println("카드해석 : "+Just.getTrans());
								System.out.println("금전운 : "+Just.getMoney());
								System.out.println("연애운 : "+Just.getLove());
								System.out.println("건강운 : "+Just.getHealth());
								System.out.println("직업운 : "+Just.getCareer());
							}
							else if(d==1) {
								RJustice RJust = new RJustice();
								System.out.println("카드이름 : "+RJust.getName());
								System.out.println("카드해석 : "+RJust.getTrans());
								System.out.println("금전운 : "+RJust.getMoney());
								System.out.println("연애운 : "+RJust.getLove());
								System.out.println("건강운 : "+RJust.getHealth());
								System.out.println("직업운 : "+RJust.getCareer());
							}
							break;
						case 12:
							

							if(d==0) {
								TheHangedMan HanMan = new TheHangedMan();
								System.out.println("카드이름 : "+HanMan.getName());
								System.out.println("카드해석 : "+HanMan.getTrans());
								System.out.println("금전운 : "+HanMan.getMoney());
								System.out.println("연애운 : "+HanMan.getLove());
								System.out.println("건강운 : "+HanMan.getHealth());
								System.out.println("직업운 : "+HanMan.getCareer());
							}
							else if(d==1) {
								RTheHangedMan RHanMan = new RTheHangedMan();
								System.out.println("카드이름 : "+RHanMan.getName());
								System.out.println("카드해석 : "+RHanMan.getTrans());
								System.out.println("금전운 : "+RHanMan.getMoney());
								System.out.println("연애운 : "+RHanMan.getLove());
								System.out.println("건강운 : "+RHanMan.getHealth());
								System.out.println("직업운 : "+RHanMan.getCareer());
							}
							break;
						case 13:
							

							if(d==0) {
								Death Death = new Death();
								System.out.println("카드이름 : "+Death.getName());
								System.out.println("카드해석 : "+Death.getTrans());
								System.out.println("금전운 : "+Death.getMoney());
								System.out.println("연애운 : "+Death.getLove());
								System.out.println("건강운 : "+Death.getHealth());
								System.out.println("직업운 : "+Death.getCareer());
							}
							else if(d==1) {
								RDeath RDeath = new RDeath();
								System.out.println("카드이름 : "+RDeath.getName());
								System.out.println("카드해석 : "+RDeath.getTrans());
								System.out.println("금전운 : "+RDeath.getMoney());
								System.out.println("연애운 : "+RDeath.getLove());
								System.out.println("건강운 : "+RDeath.getHealth());
								System.out.println("직업운 : "+RDeath.getCareer());
							}
							break;
						case 14:
							

							if(d==0) {
								Temperance Temper = new Temperance();
								System.out.println("카드이름 : "+Temper.getName());
								System.out.println("카드해석 : "+Temper.getTrans());
								System.out.println("금전운 : "+Temper.getMoney());
								System.out.println("연애운 : "+Temper.getLove());
								System.out.println("건강운 : "+Temper.getHealth());
								System.out.println("직업운 : "+Temper.getCareer());
							}
							else if(d==1) {
								RThemperance RTemper = new RThemperance();
								System.out.println("카드이름 : "+RTemper.getName());
								System.out.println("카드해석 : "+RTemper.getTrans());
								System.out.println("금전운 : "+RTemper.getMoney());
								System.out.println("연애운 : "+RTemper.getLove());
								System.out.println("건강운 : "+RTemper.getHealth());
								System.out.println("직업운 : "+RTemper.getCareer());
							}
							break;
						case 15:
							

							if(d==0) {
								TheDevil Devil = new TheDevil();
								System.out.println("카드이름 : "+Devil.getName());
								System.out.println("카드해석 : "+Devil.getTrans());
								System.out.println("금전운 : "+Devil.getMoney());
								System.out.println("연애운 : "+Devil.getLove());
								System.out.println("건강운 : "+Devil.getHealth());
								System.out.println("직업운 : "+Devil.getCareer());
							}
							else if(d==1) {
								RTheDevil RDevil = new RTheDevil();
								System.out.println("카드이름 : "+RDevil.getName());
								System.out.println("카드해석 : "+RDevil.getTrans());
								System.out.println("금전운 : "+RDevil.getMoney());
								System.out.println("연애운 : "+RDevil.getLove());
								System.out.println("건강운 : "+RDevil.getHealth());
								System.out.println("직업운 : "+RDevil.getCareer());
							}
							break;
						case 16:
							

							if(d==0) {
								TheTower Tower = new TheTower();
								System.out.println("카드이름 : "+Tower.getName());
								System.out.println("카드해석 : "+Tower.getTrans());
								System.out.println("금전운 : "+Tower.getMoney());
								System.out.println("연애운 : "+Tower.getLove());
								System.out.println("건강운 : "+Tower.getHealth());
								System.out.println("직업운 : "+Tower.getCareer());
							}
							else if(d==1) {
								RTheTower RTower = new RTheTower();
								System.out.println("카드이름 : "+RTower.getName());
								System.out.println("카드해석 : "+RTower.getTrans());
								System.out.println("금전운 : "+RTower.getMoney());
								System.out.println("연애운 : "+RTower.getLove());
								System.out.println("건강운 : "+RTower.getHealth());
								System.out.println("직업운 : "+RTower.getCareer());
							}
							break;
						case 17:
							

							if(d==0) {
								TheStar Star = new TheStar();
								System.out.println("카드이름 : "+Star.getName());
								System.out.println("카드해석 : "+Star.getTrans());
								System.out.println("금전운 : "+Star.getMoney());
								System.out.println("연애운 : "+Star.getLove());
								System.out.println("건강운 : "+Star.getHealth());
								System.out.println("직업운 : "+Star.getCareer());
							}
							else if(d==1) {
								RTheStar RStar = new RTheStar();
								System.out.println("카드이름 : "+RStar.getName());
								System.out.println("카드해석 : "+RStar.getTrans());
								System.out.println("금전운 : "+RStar.getMoney());
								System.out.println("연애운 : "+RStar.getLove());
								System.out.println("건강운 : "+RStar.getHealth());
								System.out.println("직업운 : "+RStar.getCareer());
							}
							break;
						case 18:
							

							if(d==0) {
								TheMoon Moon = new TheMoon();
								System.out.println("카드이름 : "+Moon.getName());
								System.out.println("카드해석 : "+Moon.getTrans());
								System.out.println("금전운 : "+Moon.getMoney());
								System.out.println("연애운 : "+Moon.getLove());
								System.out.println("건강운 : "+Moon.getHealth());
								System.out.println("직업운 : "+Moon.getCareer());
							}
							else if(d==1) {
								RTheMoon RMoon = new RTheMoon();
								System.out.println("카드이름 : "+RMoon.getName());
								System.out.println("카드해석 : "+RMoon.getTrans());
								System.out.println("금전운 : "+RMoon.getMoney());
								System.out.println("연애운 : "+RMoon.getLove());
								System.out.println("건강운 : "+RMoon.getHealth());
								System.out.println("직업운 : "+RMoon.getCareer());
							}
							break;
						case 19:
							

							if(d==0) {
								TheSun Sun = new TheSun();
								System.out.println("카드이름 : "+Sun.getName());
								System.out.println("카드해석 : "+Sun.getTrans());
								System.out.println("금전운 : "+Sun.getMoney());
								System.out.println("연애운 : "+Sun.getLove());
								System.out.println("건강운 : "+Sun.getHealth());
								System.out.println("직업운 : "+Sun.getCareer());
							}
							else if(d==1) {
								RTheSun RSun = new RTheSun();
								System.out.println("카드이름 : "+RSun.getName());
								System.out.println("카드해석 : "+RSun.getTrans());
								System.out.println("금전운 : "+RSun.getMoney());
								System.out.println("연애운 : "+RSun.getLove());
								System.out.println("건강운 : "+RSun.getHealth());
								System.out.println("직업운 : "+RSun.getCareer());
							}
							break;
						case 20:
							

							if(d==0) {
								Judgement Judg = new Judgement();
								System.out.println("카드이름 : "+Judg.getName());
								System.out.println("카드해석 : "+Judg.getTrans());
								System.out.println("금전운 : "+Judg.getMoney());
								System.out.println("연애운 : "+Judg.getLove());
								System.out.println("건강운 : "+Judg.getHealth());
								System.out.println("직업운 : "+Judg.getCareer());
							}
							else if(d==1) {
								RJudgement RJudg = new RJudgement();
								System.out.println("카드이름 : "+RJudg.getName());
								System.out.println("카드해석 : "+RJudg.getTrans());
								System.out.println("금전운 : "+RJudg.getMoney());
								System.out.println("연애운 : "+RJudg.getLove());
								System.out.println("건강운 : "+RJudg.getHealth());
								System.out.println("직업운 : "+RJudg.getCareer());
							}
							break;
						case 21:
							

							if(d==0) {
								TheWorld World = new TheWorld();
								System.out.println("카드이름 : "+World.getName());
								System.out.println("카드해석 : "+World.getTrans());
								System.out.println("금전운 : "+World.getMoney());
								System.out.println("연애운 : "+World.getLove());
								System.out.println("건강운 : "+World.getHealth());
								System.out.println("직업운 : "+World.getCareer());
							}
							else if(d==1) {
								RTheWorld RWorld = new RTheWorld();
								System.out.println("카드이름 : "+RWorld.getName());
								System.out.println("카드해석 : "+RWorld.getTrans());
								System.out.println("금전운 : "+RWorld.getMoney());
								System.out.println("연애운 : "+RWorld.getLove());
								System.out.println("건강운 : "+RWorld.getHealth());
								System.out.println("직업운 : "+RWorld.getCareer());
							}
							break;
					}
				}
				else if(yorn==2){//no로 대답시 그냥종료함
				break;}
				
			
			}while(yorn!=1); 
			
			
	
	
	}
		System.out.println("종료할게여");
		sc.close();
	
	}
	

}
