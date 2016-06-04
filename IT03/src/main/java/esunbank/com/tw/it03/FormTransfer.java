package esunbank.com.tw.it03;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import esunbank.com.tw.it03.form;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class FormTransfer implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public FormTransfer() {
    }

public static it03Form formTransfer(String parameter ) throws Exception {
		

			form startform =new form();
			JSONObject json  = new JSONObject(parameter);
			
			startform.setAssign(json.getString("assign"));
			startform.setSend(json.getString("send"));
			startform.setChange(json.getString("change"));
			startform.setReject(json.getString("reject"));
			startform.setComplete(json.getString("complete"));
			startform.setIscitrix(json.getString("iscitrix"));
			startform.setIsmgr(json.getString("ismgr"));
			startform.setCdept(json.getString("cdept"));
			startform.setAssignOrgPicker(json.getString("assignOrgPicker"));
			startform.setCancelCompleted(json.getString("cancelCompleted"));
			startform.setStage2(json.getString("stage2"));
			startform.setStage3(json.getString("stage3"));
			startform.setStage4(json.getString("stage4"));
			startform.setStage5(json.getString("stage5"));
			startform.setStage6(json.getString("stage6"));
			startform.setStage7(json.getString("stage7"));
			startform.setApplicant(json.getString("applicant"));

					
			
			
			
//			startform.setFirstStage(json.getString("firstStage"));

//////-------------------------
			
			 JSONArray jsonArray = json.getJSONArray("stage1list");
	    
			 JSONObject tempCSlist  = new JSONObject(parameter);
			  List<stage1> result = new ArrayList<stage1>();


	            for (int i = 0; i < jsonArray.length(); i++) {
	    
	            	stage1 stageTemp = new stage1();
//	                 stageTemp.setSigner(jsonArray.getString(i)) ;
	            	tempCSlist=new JSONObject(jsonArray.getString(i));
	                 stageTemp.User(tempCSlist.getString("user"));
	           
//	                 System.out.println(stageTemp.getSigner());
	                 
	                 result.add(stageTemp);
	
	               
	            }
	            
	            startform.setStage1list(result);  
	           
		
			return startform;
			
//////////--------		
			

	}
}


