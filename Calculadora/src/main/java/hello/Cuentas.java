package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Cuentas {
	

    @NotNull
    @Min(18)
    private int sum1,sum2,resta1,resta2,mult1,mult2,div1,div2;
    private float rtaS;
    private float rtaR;
    private float rtaM;
    private float rtaD;
    
    
	
	public int getSum1() {
		return sum1;
	}
	public void setSum1(int sum1) {
		this.sum1 = sum1;
	}
	public int getSum2() {
		return sum2;
	}
	public void setSum2(int sum2) {
		this.sum2 = sum2;
	}
	public int getResta1() {
		return resta1;
	}
	public void setResta1(int resta1) {
		this.resta1 = resta1;
	}
	public int getResta2() {
		return resta2;
	}
	public void setResta2(int resta2) {
		this.resta2 = resta2;
	}
	public int getMult1() {
		return mult1;
	}
	public void setMult1(int mult1) {
		this.mult1 = mult1;
	}
	public int getMult2() {
		return mult2;
	}
	public void setMult2(int mult2) {
		this.mult2 = mult2;
	}
	public int getDiv1() {
		return div1;
	}
	public void setDiv1(int div1) {
		this.div1 = div1;
	}
	public int getDiv2() {
		return div2;
	}
	public void setDiv2(int div2) {
		this.div2 = div2;
	}
	public float getRtaS() {
		return rtaS;
	}
	public void setRtaS(float rtaS) {
		this.rtaS = rtaS;
	}
	public float getRtaR() {
		return rtaR;
	}
	public void setRtaR(float rtaR) {
		this.rtaR = rtaR;
	}
	public float getRtaM() {
		return rtaM;
	}
	public void setRtaM(float rtaM) {
		this.rtaM = rtaM;
	}
	public float getRtaD() {
		return rtaD;
	}
	public void setRtaD(float rtaD) {
		this.rtaD = rtaD;
	}
	
	public void suma(float sum1, float sum2) {
		this.rtaS = sum1+sum2;
	}
	public void resta(float n3, float n4) {
		this.rtaR = n3-n4;
	}
	public void multiplicacion(float n5, float n6) {
		this.rtaM = n5*n6;
	}
	public void division(float n7, float n8) {
		this.rtaD = n7/n8;
	}
}
