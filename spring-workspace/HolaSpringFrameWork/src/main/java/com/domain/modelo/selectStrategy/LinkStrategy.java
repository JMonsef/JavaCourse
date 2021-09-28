package com.domain.modelo.selectStrategy;

public class LinkStrategy extends SelectStrategy{

	public LinkStrategy() {
	}

	@Override
	public String getCondicion() {
		StringBuilder sb = new StringBuilder();
		if(tengoWhere){
			sb.append(" and alu_linkgit like '%");
			sb.append(alumno.getLinkRepositorio());
			sb.append("%'");
		}else {
			sb.append("where alu_linkgit like '%");
			sb.append(alumno.getLinkRepositorio());
			sb.append("%'");
			tengoWhere = true;			
		}			
		return sb.toString();
	}

	@Override
	public boolean isMe() {
		return alumno.getLinkRepositorio()!=null	&&
				!alumno.getLinkRepositorio().isEmpty();
	}

}
