package esunbank.com.tw.it01;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class form implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(2)
	private java.lang.String complete;

    @org.kie.api.definition.type.Position(1)
	private java.lang.String reject;

    @org.kie.api.definition.type.Position(0)
	private java.lang.String send;

    @org.kie.api.definition.type.Position(3)
	private java.lang.String stage1;

    @org.kie.api.definition.type.Position(4)
	private java.lang.String stage2;

    @org.kie.api.definition.type.Position(5)
	private java.lang.String stage3;

    @org.kie.api.definition.type.Position(6)
	private java.lang.String stage4;

    @org.kie.api.definition.type.Position(7)
	private java.lang.String isdeptmgr;

	@org.kie.api.definition.type.Position(value = 8)
	private java.lang.String back;

	public java.lang.String getComplete() {
        return this.complete;
    }
    
    public void setComplete(java.lang.String complete) {
        this.complete = complete;
    }

    public java.lang.String getReject() {
        return this.reject;
    }
    
    public void setReject(java.lang.String reject) {
        this.reject = reject;
    }

    public java.lang.String getSend() {
        return this.send;
    }
    
    public void setSend(java.lang.String send) {
        this.send = send;
    }

    public java.lang.String getStage1() {
        return this.stage1;
    }
    
    public void setStage1(java.lang.String stage1) {
        this.stage1 = stage1;
    }

    public java.lang.String getStage2() {
        return this.stage2;
    }
    
    public void setStage2(java.lang.String stage2) {
        this.stage2 = stage2;
    }

    public java.lang.String getStage3() {
        return this.stage3;
    }
    
    public void setStage3(java.lang.String stage3) {
        this.stage3 = stage3;
    }

    public java.lang.String getStage4() {
        return this.stage4;
    }
    
    public void setStage4(java.lang.String stage4) {
        this.stage4 = stage4;
    }

	public java.lang.String getIsdeptmgr() {
		return this.isdeptmgr;
	}

	public void setIsdeptmgr(java.lang.String isdeptmgr) {
		this.isdeptmgr = isdeptmgr;
	}

	public java.lang.String getBack() {
		return this.back;
	}

	public void setBack(java.lang.String back) {
		this.back = back;
	}

	public form() {
	}

	public form(java.lang.String send, java.lang.String reject,
			java.lang.String complete, java.lang.String stage1,
			java.lang.String stage2, java.lang.String stage3,
			java.lang.String stage4, java.lang.String isdeptmgr,
			java.lang.String back) {
		this.send = send;
		this.reject = reject;
		this.complete = complete;
		this.stage1 = stage1;
		this.stage2 = stage2;
		this.stage3 = stage3;
		this.stage4 = stage4;
		this.isdeptmgr = isdeptmgr;
		this.back = back;
	}

}