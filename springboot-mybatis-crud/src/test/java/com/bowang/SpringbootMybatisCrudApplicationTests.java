package com.bowang;

import com.bowang.mapper.EmpMapper;
import com.bowang.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

	@Autowired
	private EmpMapper empMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void testDelete() {
		int delete = empMapper.delete(21  );
		System.out.println(delete );
	}

 	@Test
	public void testInsert() {
		// 构造员工对象
		 Emp emp = new Emp();
		 emp.setUsername("Tom");
		 emp.setName("汤姆");
		 emp.setImage("1.jpg");
		 emp.setGender((short)1);
		 emp.setJob((short)1);
		 emp.setEntrydate(LocalDate.of(2000 ,1, 1));
		 emp.setCreateTime(LocalDateTime.now());
		 emp.setUpdateTime(LocalDateTime.now());
		 emp.setDeptId(1);

		 // 执行新增员工操作
		 empMapper.insert(emp);
		 System.out.println(emp.getId());

	 }

	 @Test
	public void testupdate() {
		 // 构造员工对象
		 Emp emp = new Emp();
		 emp.setId(23);
		 emp.setUsername("Jerry");
		 emp.setName("杰瑞");
		 emp.setImage("1.jpg");
		 emp.setGender((short)1);
		 emp.setJob((short)1);
		 emp.setEntrydate(LocalDate.of(2000 ,1, 1));
		 emp.setUpdateTime(LocalDateTime.now());
		 emp.setDeptId(1);

		 empMapper.update(emp);
	 }

	 @Test
	public void testGetById() {
		Emp emp = empMapper.getById(23);
		System.out.println(emp);
	 }

	 @Test
	public void testList() {
//		 List<Emp> empList = empMapper.list("张", (short)1, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
//		 List<Emp> empList = empMapper.list(null, (short) 1, null, null);
		 List<Emp> empList = empMapper.list(null, null, null, null);
		 System.out.println(empList);
	 }

	 @Test
	public void testUpdate2() {
		 // 构造员工对象
		 Emp emp = new Emp();
		 emp.setId(14);
		 emp.setUsername("Jerry222");
		 emp.setName("杰瑞222");
		 emp.setGender((short)2);
		 emp.setUpdateTime(LocalDateTime.now());

		 empMapper.update2(emp);
	 }

	 @Test
	public void testDeleteByIds() {
		List<Integer> ids = Arrays.asList(13, 14, 15);
		empMapper.deleteByIds(ids);
	 }
}
