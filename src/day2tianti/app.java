package day2tianti;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputSteamReader;
public class app {
	public static Game[] games = new Game[10];
	
	public static void main(String[] args) {
		// project
		Project[] projects = new Project[3];
		Project proj = new Project();
		proj.name = "xunhuan";
		proj.desc="xunhuan";
		projects[0] = proj;
		Project proj2 = new Project();
		proj2.name = "bianli";
		proj2.desc="bianli";
		projects[1] = proj2;
		Project proj3 = new Project();
		proj3.name = "paixu";
		proj3.desc="paixu";
		projects[2] = proj3;
		
		for (int x=0;x<projects.length;x++) {
			if (projects[x] !=null) {
				System.out.println(projects[x].name);
			}
		}
		
		//user
		User[] users = new User[5];
		User user1 = new User();
		user1.name = "1";
		user1.loginName="111";
		user1.passwd = "1111";
		user1.point = 340;
		users[0] = user1;
		User user2 = new User();
		user2.name = "";
		user2.loginName="2";
		user2.loginName="222";
		user2.passwd = "2222";
		user2.point = 640;
		users[1] = user2;
		User user3 = new User();
		user3.name = "3";
		user3.loginName="333";
		user3.passwd = "3333";
		user3.point = 3000;
		users[2] = user3;
		User user4 = new User();
		user4.name = "4";
		user4.loginName="444";
		user4.passwd = "4444";
		user4.point = 80;
		users[3] = user4;
		User user5 = new User();
		user5.name = "5";
		user5.loginName="555";
		user5.passwd = "5555";
		user5.point = 440;
		users[4] = user5;
		
		// rank
		String[] array1 = {"入门","青铜","白银","黄金","白金","钻石","大师","王者"};
		for (int x = 0; x < users.length; x++) {
			if (users[x].point <= 2400) {
				users[x].rank = array1[(users[x].point/300)];
				System.out.println(users[x].rank);
		}else {
			users[x].rank = array1[7];
			System.out.println(users[x].rank);
		}
			}
		
		

		
		//games
		Game[] games = new Game[10];
		Game game1 = new Game();
		game1.name = "1";
		games[0] = game1;
		game1.user= users[1];
		Game game2 = new Game();
		game2.name = "2";
		games[1] = game2;
		Game game3 = new Game();
		game3.name = "3";
		games[2] = game3;
		Game game4 = new Game();
		game4.name = "4";
		games[3] = game4;
		Game game5 = new Game();
		game5.name = "5";
		games[4] = game5;
		game5.user= users[1];
		Game game6 = new Game();
		game6.name = "6";
		games[5] = game6;
		Game game7 = new Game();
		game7.name = "7";
		games[6] = game7;
		Game game8 = new Game();
		game8.name = "8";
		games[7] = game8;
		Game game9 = new Game();
		game9.name = "9";
		games[8] = game9;
		Game game10 = new Game();
		game10.name = "10";
		games[9] = game10;
		
		// 统计第2个用户的平均分
		int a = 0;
		for (int x = 0; x < games.length; x++) {
			// method overloading
			
			if (games[x].user == users[1]) {
				a+= 1 ;
			}
		}

		int a3 = 0;
		if (a!= 0) {
			a3 = users[1].point/a;
		}else {
			a3 = 0;
		}
		System.out.println(a3);
	}
	
}