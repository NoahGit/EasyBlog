package dao;

import java.util.List;

import entity.Emp;

public interface EmpDAO {
	public int add(Emp emp);//��ӣ��û�ע��
	public Emp findByEname(String ename);//���ݲ������Ʋ�ѯ������Ϣ
	public Emp findByEmpno(int empNo);//���ݲ��ű�Ų�ѯ������Ϣ
	public List findAll(); //��ѯ���в�����Ϣ
	public List findByDeptNo(int  dempNo);//��ѯĳ�������еĹ�Ա��Ϣ
	
	
	
}
