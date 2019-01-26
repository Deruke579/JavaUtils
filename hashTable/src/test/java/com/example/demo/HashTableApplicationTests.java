package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HashTableApplicationTests {

	public static java.util.Hashtable CommandDescr = new java.util.Hashtable();

	@Test
	public void contextLoads() {
	}

	@Test
	public void hashTable(){
		CommandDescr.put("0x8300", "文本信息下发");
		HashMap commandMap = new HashMap();
		for (Iterator<String> iterator = CommandDescr.keySet().iterator(); iterator.hasNext();){
			String key = iterator.next();
			Object value= CommandDescr.get(key);

//			int va = Integer.parseInt(key,16);
			String str = key.substring(2);
			int n = Integer.parseInt(str,16);
			commandMap.put(key,n);
		}
		System.out.println(commandMap);
	}

}
