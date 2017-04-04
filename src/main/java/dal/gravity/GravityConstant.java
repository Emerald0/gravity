package dal.gravity;

public class GravityConstant implements GravityModel{
	private double gravity;
	
	public void GravirtyConstant(double value){
		gravity=value;
	}

	@Override
	public double getGravitationalField() {
		// TODO Auto-generated method stub
		return gravity;
	}

}
