package esunbank.com.tw.it01;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import esunbank.com.tw.it01.form;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IT01FormTransfer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	public static form formTransfer(String parameter) throws Exception {

		form startform = new form();
		JSONObject json = new JSONObject(parameter);

		startform.setSend(json.getString("send"));
		startform.setReject(json.getString("reject"));
		startform.setComplete(json.getString("complete"));
		startform.setBack(json.getString("back"));
		startform.setIsdeptmgr(json.getString("isdeptmgr"));
		startform.setIsreplyer(json.getString("isreplyer"));
		startform.setStage1(json.getString("stage1"));
		startform.setStage2(json.getString("stage2"));
		startform.setStage3(json.getString("stage3"));
		startform.setStage4(json.getString("stage4"));

		// JSONArray jsonArray = json.getJSONArray("stage1list"); ?|????list??

		/*
		 * ?s??json?}?C????k JSONObject tempCSlist = new JSONObject(parameter);
		 * List<stage1> result = new ArrayList<stage1>();
		 * 
		 * 
		 * for (int i = 0; i < jsonArray.length(); i++) {
		 * 
		 * stage1 stageTemp = new stage1();
		 * stageTemp.setSigner(jsonArray.getString(i)) ; tempCSlist=new
		 * JSONObject(jsonArray.getString(i));
		 * stageTemp.User(tempCSlist.getString("user"));
		 * 
		 * System.out.println(stageTemp.getSigner());
		 * 
		 * result.add(stageTemp);
		 * 
		 * 
		 * }
		 * 
		 * startform.setStage1list(result);
		 */

		return startform;

	}

	public IT01FormTransfer() {
	}
}
