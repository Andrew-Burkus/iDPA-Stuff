
public class Sloth {
	private int var;
	private String Color;
	private int age;
	private boolean lovespeople;
	private String name;
	private int weight;
	private boolean hasmotivation;
	private String location;//defined
	private int speed;
	private boolean is_attacking;
	private boolean causing_anarchy;
	private int[] arr;
	public void Sloth()
	{
		arr = new int[10];
		Color = "Purplez";
		age = 55;
		lovespeople = false;
		name = "The Master of the Universe";
		weight = 67;
		hasmotivation = false;
		location = "Unknown, he will find you when the time is right";
		speed = 100;
		is_attacking=true;
		causing_anarchy=true;
	}
		public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
		private int getvar()
		{
			return var;
		}
		
		private void setvar(int v)
		{
			var=v;
		}
		public int getVar() {
			return var;
		}
		public void setVar(int var) {
			this.var = var;
		}
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isLovespeople() {
			return lovespeople;
		}
		public void setLovespeople(boolean lovespeople) {
			this.lovespeople = lovespeople;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public boolean isHasmotivation() {
			return hasmotivation;
		}
		public void setHasmotivation(boolean hasmotivation) {
			this.hasmotivation = hasmotivation;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public boolean isIs_attacking() {
			return is_attacking;
		}
		public void setIs_attacking(boolean is_attacking) {
			this.is_attacking = is_attacking;
		}
		public boolean isCausing_anarchy() {
			return causing_anarchy;
		}
		public void setCausing_anarchy(boolean causing_anarchy) {
			this.causing_anarchy = causing_anarchy;
		}
		////////////////\\\\\\\\\\\\\\\\\
		public void speed()
		{
			System.out.println(speed);
		}
		public void attacking()
		{
			System.out.println(is_attacking);
		}
		public void causing_anarchy()
		{
			System.out.println(causing_anarchy);
		}
}
