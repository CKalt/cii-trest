package com.cii.model.config;

import java.util.List;

public class LogicActionListener extends ActionListener {
	private List<String> operands;
	private String logic = "AND";
	private String toStateId;
	private String status;
	private String template;
	private BulkWorkflowStateMove bulkWorkflowStateMove;
	
	public List<String> getOperands() {
		return operands;
	}

	public void setOperands(List<String> ops) {
		this.operands = ops;
	}

	public String getToStateId() {
		return toStateId;
	}

	public void setToStateId(String toStateId) {
		this.toStateId = toStateId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getLogic() {
		return logic;
	}

	public void setLogic(String logic) {
		this.logic = logic;
	}

	public void setBulkWorkflowStateMove(BulkWorkflowStateMove bulkWorkflowStateMove) { this.bulkWorkflowStateMove = bulkWorkflowStateMove; }

	public BulkWorkflowStateMove getBulkWorkflowStateMove() { return bulkWorkflowStateMove; }
}
