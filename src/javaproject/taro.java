package javaproject;
import java.util.*;
public class taro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int yorn = 0;
		int a = 0, b=0,c=0;
		int d = 0;
		int rdnu = 0;
		
		System.out.println("Ÿ������ �����Áٽ��ϱ�? YES(1) NO(2)");
	
		try {//���� ���� �����Է��ϴ°� ���
			yorn = sc.nextInt();//Yes Or No �ޱ�}
			if(yorn>2) {//1�̳�2�ƴϸ� ���{
				System.out.println("1,2�� �Է��� �ּ���");
				System.out.println("Ÿ������ �����Áٽ��ϱ�? YES(1) NO(2) �̹����� ���ȵ����� �׳� �����Դϴ�.");
				yorn = sc.nextInt();
				
				}
			}
	
		catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼž���~");
			
	}
		

		Random rd = new Random();
		
		a=rd.nextInt(22);//ī�� 3�� �����̱�
		b=rd.nextInt(22);
		c=rd.nextInt(22);
		
		for(int i = 0;i<5;i++) {//ī�尡 ��ġ�� �ٽ� �̱�
			if(a==b) {
				b=rd.nextInt(22);
			}
		}
		
		
		for(int h = 0;h<5;h++) {//ī�尡 ��ġ�� �ٽ� �̱�<
			
			if(a==c||b==c) {
				c=rd.nextInt(22);
			}
		}
		if(yorn==1) //����� yes�̸� ����
		for(int ka = 0;ka<=2;ka++) {//���� ���� �̷� ������ ���
			if(ka==0) {
				d=rd.nextInt(2);//ī�� ��, ������ ���ϱ�
				rdnu=a;
				System.out.println("����");
			}
			else if(ka==1) {
				d=rd.nextInt(2);
				rdnu=b;
				System.out.println("����");
			}
			else if(ka==2) {
				d=rd.nextInt(2);
				rdnu=c;
				System.out.println("�̷�");
			}
			do {
				if(yorn==1) {
					switch(rdnu) {//case�� �� ī�� ��ȣ�� �Է��ϸ� ī�带 ã�ư�
						case 0:
							if(d==0) {
								TheFool TheFool = new TheFool();
		
								System.out.println("ī���̸� : "+TheFool.getName());
								System.out.println("ī���ؼ� : "+TheFool.getTrans());
								System.out.println("������ : "+TheFool.getMoney());
								System.out.println("���ֿ� : "+TheFool.getLove());
								System.out.println("�ǰ��� : "+TheFool.getHealth());
								System.out.println("������ : "+TheFool.getCareer());
							
						}
							else if(d==1) {
								RTheFool RTheFool = new RTheFool();
								System.out.println("ī���̸� : "+RTheFool.getName());
								System.out.println("ī���ؼ� : "+RTheFool.getTrans());
								System.out.println("������ : "+RTheFool.getMoney());
								System.out.println("���ֿ� : "+RTheFool.getLove());
								System.out.println("�ǰ��� : "+RTheFool.getHealth());
								System.out.println("������ : "+RTheFool.getCareer());
								
							}
							break;
						case 1:
							if(d==0) {
								TheMagician Themagic = new TheMagician();
								System.out.println("ī���̸� : "+Themagic.getName());
								System.out.println("ī���ؼ� : "+Themagic.getTrans());
								System.out.println("������ : "+Themagic.getMoney());
								System.out.println("���ֿ� : "+Themagic.getLove());
								System.out.println("�ǰ��� : "+Themagic.getHealth());
								System.out.println("������ : "+Themagic.getCareer());
								
							}
							else if(d==1) {
								RTheMagician RThemagic = new RTheMagician();
								System.out.println("ī���̸� : "+RThemagic.getName());
								System.out.println("ī���ؼ� : "+RThemagic.getTrans());
								System.out.println("������ : "+RThemagic.getMoney());
								System.out.println("���ֿ� : "+RThemagic.getLove());
								System.out.println("�ǰ��� : "+RThemagic.getHealth());
								System.out.println("������ : "+RThemagic.getCareer());
								
							}
							break;
						case 2:
							if(d==0) {
								TheHighPriestess TheHighPri = new TheHighPriestess();
								System.out.println("ī���̸� : "+TheHighPri.getName());
								System.out.println("ī���ؼ� : "+TheHighPri.getTrans());
								System.out.println("������ : "+TheHighPri.getMoney());
								System.out.println("���ֿ� : "+TheHighPri.getLove());
								System.out.println("�ǰ��� : "+TheHighPri.getHealth());
								System.out.println("������ : "+TheHighPri.getCareer());
								
							}
							else if(d==1) {
								RTheHighPriestess RTheHighPri = new RTheHighPriestess();
								System.out.println("ī���̸� : "+RTheHighPri.getName());
								System.out.println("ī���ؼ� : "+RTheHighPri.getTrans());
								System.out.println("������ : "+RTheHighPri.getMoney());
								System.out.println("���ֿ� : "+RTheHighPri.getLove());
								System.out.println("�ǰ��� : "+RTheHighPri.getHealth());
								System.out.println("������ : "+RTheHighPri.getCareer());
								}
							break;
						case 3:
							
	
							if(d==0) {
								TheEmpress Empers  = new TheEmpress();
								
								System.out.println("ī���̸� : "+Empers.getName());
								System.out.println("ī���ؼ� : "+Empers.getTrans());
								System.out.println("������ : "+Empers.getMoney());
								System.out.println("���ֿ� : "+Empers.getLove());
								System.out.println("�ǰ��� : "+Empers.getHealth());
								System.out.println("������ : "+Empers.getCareer());
							}
							else if(d==1) {
								RTheEmpress REmpers  = new RTheEmpress();
								
								System.out.println("ī���̸� : "+REmpers.getName());
								System.out.println("ī���ؼ� : "+REmpers.getTrans());
								System.out.println("������ : "+REmpers.getMoney());
								System.out.println("���ֿ� : "+REmpers.getLove());
								System.out.println("�ǰ��� : "+REmpers.getHealth());
								System.out.println("������ : "+REmpers.getCareer());
							}
							break;
						case 4:
							
							
							if(d==0) {
								TheEmperor Emper  = new TheEmperor();
								System.out.println("ī���̸� : "+Emper.getName());
								System.out.println("ī���ؼ� : "+Emper.getTrans());
								System.out.println("������ : "+Emper.getMoney());
								System.out.println("���ֿ� : "+Emper.getLove());
								System.out.println("�ǰ��� : "+Emper.getHealth());
								System.out.println("������ : "+Emper.getCareer());
							}
							else if(d==1) {
								RTheEmperor REmper  = new RTheEmperor();
								System.out.println("ī���̸� : "+REmper.getName());
								System.out.println("ī���ؼ� : "+REmper.getTrans());
								System.out.println("������ : "+REmper.getMoney());
								System.out.println("���ֿ� : "+REmper.getLove());
								System.out.println("�ǰ��� : "+REmper.getHealth());
								System.out.println("������ : "+REmper.getCareer());
							}
							break;
						case 5:
							
							if(d==0) {
								TheHierophant Hiero = new TheHierophant();
								System.out.println("ī���̸� : "+Hiero.getName());
								System.out.println("ī���ؼ� : "+Hiero.getTrans());
								System.out.println("������ : "+Hiero.getMoney());
								System.out.println("���ֿ� : "+Hiero.getLove());
								System.out.println("�ǰ��� : "+Hiero.getHealth());
								System.out.println("������ : "+Hiero.getCareer());
							}
							else if(d==1) {
								RTheHierophant RHiero = new RTheHierophant();
								System.out.println("ī���̸� : "+RHiero.getName());
								System.out.println("ī���ؼ� : "+RHiero.getTrans());
								System.out.println("������ : "+RHiero.getMoney());
								System.out.println("���ֿ� : "+RHiero.getLove());
								System.out.println("�ǰ��� : "+RHiero.getHealth());
								System.out.println("������ : "+RHiero.getCareer());
							}
							break;
						case 6:
							
							if(d==0) {
								TheLovers loves = new TheLovers();
								System.out.println("ī���̸� : "+loves.getName());
								System.out.println("ī���ؼ� : "+loves.getTrans());
								System.out.println("������ : "+loves.getMoney());
								System.out.println("���ֿ� : "+loves.getLove());
								System.out.println("�ǰ��� : "+loves.getHealth());
								System.out.println("������ : "+loves.getCareer());
							}
							else if(d==1) {
								RTheLovers Rloves = new RTheLovers();
								System.out.println("ī���̸� : "+Rloves.getName());
								System.out.println("ī���ؼ� : "+Rloves.getTrans());
								System.out.println("������ : "+Rloves.getMoney());
								System.out.println("���ֿ� : "+Rloves.getLove());
								System.out.println("�ǰ��� : "+Rloves.getHealth());
								System.out.println("������ : "+Rloves.getCareer());
							}
							break;
						case 7:
							

							if(d==0) {
								TheChariot Chari = new TheChariot();
								System.out.println("ī���̸� : "+Chari.getName());
								System.out.println("ī���ؼ� : "+Chari.getTrans());
								System.out.println("������ : "+Chari.getMoney());
								System.out.println("���ֿ� : "+Chari.getLove());
								System.out.println("�ǰ��� : "+Chari.getHealth());
								System.out.println("������ : "+Chari.getCareer());
							}
							else if(d==1) {
								RTheChariot RChari = new RTheChariot();
								System.out.println("ī���̸� : "+RChari.getName());
								System.out.println("ī���ؼ� : "+RChari.getTrans());
								System.out.println("������ : "+RChari.getMoney());
								System.out.println("���ֿ� : "+RChari.getLove());
								System.out.println("�ǰ��� : "+RChari.getHealth());
								System.out.println("������ : "+RChari.getCareer());
							}
							break;
						case 8:
							

							if(d==0) {
								Strength Str = new Strength();
								System.out.println("ī���̸� : "+Str.getName());
								System.out.println("ī���ؼ� : "+Str.getTrans());
								System.out.println("������ : "+Str.getMoney());
								System.out.println("���ֿ� : "+Str.getLove());
								System.out.println("�ǰ��� : "+Str.getHealth());
								System.out.println("������ : "+Str.getCareer());
							}
							else if(d==1) {
								RStrength RStr = new RStrength();
								System.out.println("ī���̸� : "+RStr.getName());
								System.out.println("ī���ؼ� : "+RStr.getTrans());
								System.out.println("������ : "+RStr.getMoney());
								System.out.println("���ֿ� : "+RStr.getLove());
								System.out.println("�ǰ��� : "+RStr.getHealth());
								System.out.println("������ : "+RStr.getCareer());
							}
							break;
						case 9:
							

							if(d==0) {
								TheHermit TheHerm = new TheHermit();
								System.out.println("ī���̸� : "+TheHerm.getName());
								System.out.println("ī���ؼ� : "+TheHerm.getTrans());
								System.out.println("������ : "+TheHerm.getMoney());
								System.out.println("���ֿ� : "+TheHerm.getLove());
								System.out.println("�ǰ��� : "+TheHerm.getHealth());
								System.out.println("������ : "+TheHerm.getCareer());
							}
							else if(d==1) {
								RTheHermit RTheHerm = new RTheHermit();
								System.out.println("ī���̸� : "+RTheHerm.getName());
								System.out.println("ī���ؼ� : "+RTheHerm.getTrans());
								System.out.println("������ : "+RTheHerm.getMoney());
								System.out.println("���ֿ� : "+RTheHerm.getLove());
								System.out.println("�ǰ��� : "+RTheHerm.getHealth());
								System.out.println("������ : "+RTheHerm.getCareer());
							}
							break;
						case 10:
							

							if(d==0) {
								WheelOfFortune Wheelof = new WheelOfFortune();
								System.out.println("ī���̸� : "+Wheelof.getName());
								System.out.println("ī���ؼ� : "+Wheelof.getTrans());
								System.out.println("������ : "+Wheelof.getMoney());
								System.out.println("���ֿ� : "+Wheelof.getLove());
								System.out.println("�ǰ��� : "+Wheelof.getHealth());
								System.out.println("������ : "+Wheelof.getCareer());
							}
							else if(d==1) {
								RWheelOfFortune RWheelof = new RWheelOfFortune();
								System.out.println("ī���̸� : "+RWheelof.getName());
								System.out.println("ī���ؼ� : "+RWheelof.getTrans());
								System.out.println("������ : "+RWheelof.getMoney());
								System.out.println("���ֿ� : "+RWheelof.getLove());
								System.out.println("�ǰ��� : "+RWheelof.getHealth());
								System.out.println("������ : "+RWheelof.getCareer());
							}
							break;
						case 11:
							

							if(d==0) {
								Justice Just = new Justice();
								System.out.println("ī���̸� : "+Just.getName());
								System.out.println("ī���ؼ� : "+Just.getTrans());
								System.out.println("������ : "+Just.getMoney());
								System.out.println("���ֿ� : "+Just.getLove());
								System.out.println("�ǰ��� : "+Just.getHealth());
								System.out.println("������ : "+Just.getCareer());
							}
							else if(d==1) {
								RJustice RJust = new RJustice();
								System.out.println("ī���̸� : "+RJust.getName());
								System.out.println("ī���ؼ� : "+RJust.getTrans());
								System.out.println("������ : "+RJust.getMoney());
								System.out.println("���ֿ� : "+RJust.getLove());
								System.out.println("�ǰ��� : "+RJust.getHealth());
								System.out.println("������ : "+RJust.getCareer());
							}
							break;
						case 12:
							

							if(d==0) {
								TheHangedMan HanMan = new TheHangedMan();
								System.out.println("ī���̸� : "+HanMan.getName());
								System.out.println("ī���ؼ� : "+HanMan.getTrans());
								System.out.println("������ : "+HanMan.getMoney());
								System.out.println("���ֿ� : "+HanMan.getLove());
								System.out.println("�ǰ��� : "+HanMan.getHealth());
								System.out.println("������ : "+HanMan.getCareer());
							}
							else if(d==1) {
								RTheHangedMan RHanMan = new RTheHangedMan();
								System.out.println("ī���̸� : "+RHanMan.getName());
								System.out.println("ī���ؼ� : "+RHanMan.getTrans());
								System.out.println("������ : "+RHanMan.getMoney());
								System.out.println("���ֿ� : "+RHanMan.getLove());
								System.out.println("�ǰ��� : "+RHanMan.getHealth());
								System.out.println("������ : "+RHanMan.getCareer());
							}
							break;
						case 13:
							

							if(d==0) {
								Death Death = new Death();
								System.out.println("ī���̸� : "+Death.getName());
								System.out.println("ī���ؼ� : "+Death.getTrans());
								System.out.println("������ : "+Death.getMoney());
								System.out.println("���ֿ� : "+Death.getLove());
								System.out.println("�ǰ��� : "+Death.getHealth());
								System.out.println("������ : "+Death.getCareer());
							}
							else if(d==1) {
								RDeath RDeath = new RDeath();
								System.out.println("ī���̸� : "+RDeath.getName());
								System.out.println("ī���ؼ� : "+RDeath.getTrans());
								System.out.println("������ : "+RDeath.getMoney());
								System.out.println("���ֿ� : "+RDeath.getLove());
								System.out.println("�ǰ��� : "+RDeath.getHealth());
								System.out.println("������ : "+RDeath.getCareer());
							}
							break;
						case 14:
							

							if(d==0) {
								Temperance Temper = new Temperance();
								System.out.println("ī���̸� : "+Temper.getName());
								System.out.println("ī���ؼ� : "+Temper.getTrans());
								System.out.println("������ : "+Temper.getMoney());
								System.out.println("���ֿ� : "+Temper.getLove());
								System.out.println("�ǰ��� : "+Temper.getHealth());
								System.out.println("������ : "+Temper.getCareer());
							}
							else if(d==1) {
								RThemperance RTemper = new RThemperance();
								System.out.println("ī���̸� : "+RTemper.getName());
								System.out.println("ī���ؼ� : "+RTemper.getTrans());
								System.out.println("������ : "+RTemper.getMoney());
								System.out.println("���ֿ� : "+RTemper.getLove());
								System.out.println("�ǰ��� : "+RTemper.getHealth());
								System.out.println("������ : "+RTemper.getCareer());
							}
							break;
						case 15:
							

							if(d==0) {
								TheDevil Devil = new TheDevil();
								System.out.println("ī���̸� : "+Devil.getName());
								System.out.println("ī���ؼ� : "+Devil.getTrans());
								System.out.println("������ : "+Devil.getMoney());
								System.out.println("���ֿ� : "+Devil.getLove());
								System.out.println("�ǰ��� : "+Devil.getHealth());
								System.out.println("������ : "+Devil.getCareer());
							}
							else if(d==1) {
								RTheDevil RDevil = new RTheDevil();
								System.out.println("ī���̸� : "+RDevil.getName());
								System.out.println("ī���ؼ� : "+RDevil.getTrans());
								System.out.println("������ : "+RDevil.getMoney());
								System.out.println("���ֿ� : "+RDevil.getLove());
								System.out.println("�ǰ��� : "+RDevil.getHealth());
								System.out.println("������ : "+RDevil.getCareer());
							}
							break;
						case 16:
							

							if(d==0) {
								TheTower Tower = new TheTower();
								System.out.println("ī���̸� : "+Tower.getName());
								System.out.println("ī���ؼ� : "+Tower.getTrans());
								System.out.println("������ : "+Tower.getMoney());
								System.out.println("���ֿ� : "+Tower.getLove());
								System.out.println("�ǰ��� : "+Tower.getHealth());
								System.out.println("������ : "+Tower.getCareer());
							}
							else if(d==1) {
								RTheTower RTower = new RTheTower();
								System.out.println("ī���̸� : "+RTower.getName());
								System.out.println("ī���ؼ� : "+RTower.getTrans());
								System.out.println("������ : "+RTower.getMoney());
								System.out.println("���ֿ� : "+RTower.getLove());
								System.out.println("�ǰ��� : "+RTower.getHealth());
								System.out.println("������ : "+RTower.getCareer());
							}
							break;
						case 17:
							

							if(d==0) {
								TheStar Star = new TheStar();
								System.out.println("ī���̸� : "+Star.getName());
								System.out.println("ī���ؼ� : "+Star.getTrans());
								System.out.println("������ : "+Star.getMoney());
								System.out.println("���ֿ� : "+Star.getLove());
								System.out.println("�ǰ��� : "+Star.getHealth());
								System.out.println("������ : "+Star.getCareer());
							}
							else if(d==1) {
								RTheStar RStar = new RTheStar();
								System.out.println("ī���̸� : "+RStar.getName());
								System.out.println("ī���ؼ� : "+RStar.getTrans());
								System.out.println("������ : "+RStar.getMoney());
								System.out.println("���ֿ� : "+RStar.getLove());
								System.out.println("�ǰ��� : "+RStar.getHealth());
								System.out.println("������ : "+RStar.getCareer());
							}
							break;
						case 18:
							

							if(d==0) {
								TheMoon Moon = new TheMoon();
								System.out.println("ī���̸� : "+Moon.getName());
								System.out.println("ī���ؼ� : "+Moon.getTrans());
								System.out.println("������ : "+Moon.getMoney());
								System.out.println("���ֿ� : "+Moon.getLove());
								System.out.println("�ǰ��� : "+Moon.getHealth());
								System.out.println("������ : "+Moon.getCareer());
							}
							else if(d==1) {
								RTheMoon RMoon = new RTheMoon();
								System.out.println("ī���̸� : "+RMoon.getName());
								System.out.println("ī���ؼ� : "+RMoon.getTrans());
								System.out.println("������ : "+RMoon.getMoney());
								System.out.println("���ֿ� : "+RMoon.getLove());
								System.out.println("�ǰ��� : "+RMoon.getHealth());
								System.out.println("������ : "+RMoon.getCareer());
							}
							break;
						case 19:
							

							if(d==0) {
								TheSun Sun = new TheSun();
								System.out.println("ī���̸� : "+Sun.getName());
								System.out.println("ī���ؼ� : "+Sun.getTrans());
								System.out.println("������ : "+Sun.getMoney());
								System.out.println("���ֿ� : "+Sun.getLove());
								System.out.println("�ǰ��� : "+Sun.getHealth());
								System.out.println("������ : "+Sun.getCareer());
							}
							else if(d==1) {
								RTheSun RSun = new RTheSun();
								System.out.println("ī���̸� : "+RSun.getName());
								System.out.println("ī���ؼ� : "+RSun.getTrans());
								System.out.println("������ : "+RSun.getMoney());
								System.out.println("���ֿ� : "+RSun.getLove());
								System.out.println("�ǰ��� : "+RSun.getHealth());
								System.out.println("������ : "+RSun.getCareer());
							}
							break;
						case 20:
							

							if(d==0) {
								Judgement Judg = new Judgement();
								System.out.println("ī���̸� : "+Judg.getName());
								System.out.println("ī���ؼ� : "+Judg.getTrans());
								System.out.println("������ : "+Judg.getMoney());
								System.out.println("���ֿ� : "+Judg.getLove());
								System.out.println("�ǰ��� : "+Judg.getHealth());
								System.out.println("������ : "+Judg.getCareer());
							}
							else if(d==1) {
								RJudgement RJudg = new RJudgement();
								System.out.println("ī���̸� : "+RJudg.getName());
								System.out.println("ī���ؼ� : "+RJudg.getTrans());
								System.out.println("������ : "+RJudg.getMoney());
								System.out.println("���ֿ� : "+RJudg.getLove());
								System.out.println("�ǰ��� : "+RJudg.getHealth());
								System.out.println("������ : "+RJudg.getCareer());
							}
							break;
						case 21:
							

							if(d==0) {
								TheWorld World = new TheWorld();
								System.out.println("ī���̸� : "+World.getName());
								System.out.println("ī���ؼ� : "+World.getTrans());
								System.out.println("������ : "+World.getMoney());
								System.out.println("���ֿ� : "+World.getLove());
								System.out.println("�ǰ��� : "+World.getHealth());
								System.out.println("������ : "+World.getCareer());
							}
							else if(d==1) {
								RTheWorld RWorld = new RTheWorld();
								System.out.println("ī���̸� : "+RWorld.getName());
								System.out.println("ī���ؼ� : "+RWorld.getTrans());
								System.out.println("������ : "+RWorld.getMoney());
								System.out.println("���ֿ� : "+RWorld.getLove());
								System.out.println("�ǰ��� : "+RWorld.getHealth());
								System.out.println("������ : "+RWorld.getCareer());
							}
							break;
					}
				}
				else if(yorn==2){//no�� ���� �׳�������
				break;}
				
			
			}while(yorn!=1); 
			
			
	
	
	}
		System.out.println("�����ҰԿ�");
		sc.close();
	
	}
	

}
