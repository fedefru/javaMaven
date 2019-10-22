package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Cuentas {

    @NotNull
    @Min(18)
    private float sum1,sum2,resta1,resta2,mult1,mult2,div1,div2;
    private float rtaS;
    private float rtaR;
    private float rtaM;
    private float rtaD;
    
    
	
	public float getSum1() {
		return sum1;
	}
	public void setSum1(float sum1) {
		this.sum1 = sum1;
	}
	public float getSum2() {
		return sum2;
	}
	public void setSum2(float sum2) {
		this.sum2 = sum2;
	}
	public float getResta1() {
		return resta1;
	}
	public void setResta1(float resta1) {
		this.resta1 = resta1;
	}
	public float getResta2() {
		return resta2;
	}
	public void setResta2(float resta2) {
		this.resta2 = resta2;
	}
	public float getMult1() {
		return mult1;
	}
	public void setMult1(float mult1) {
		this.mult1 = mult1;
	}
	public float getMult2() {
		return mult2;
	}
	public void setMult2(float mult2) {
		this.mult2 = mult2;
	}
	public float getDiv1() {
		return div1;
	}
	public void setDiv1(float div1) {
		this.div1 = div1;
	}
	public float getDiv2() {
		return div2;
	}
	public void setDiv2(float div2) {
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
	
	public void suma(float t, float h) {
		this.rtaS = t+h;
	}
	public void resta(float resta1, float resta2) {
		this.rtaR = resta1-resta2;
	}
	public void multiplicacion(float mult1, float mult2) {
		this.rtaM = mult1*mult2;
	}
	public void division(float div1, float div2) {
		this.rtaD = div1/div2;
	}
}
