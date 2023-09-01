package com.basic.exam17;

import static java.lang.System.out;

import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		String[] item = {"소나타","렉스톤","제규어"};
		
		LinkedList<String> q = new LinkedList<String>();
		for(String n : item)
			q.offer(n); //요소 추가
		out.println("q의 크기:"+q.size());
		/*
			q의 크기:3
		 */
		String data="";
		while((data = q.poll()) != null){
			out.println(data+"삭제!");
			out.println("q의 크기:"+q.size());
		}
			/*
				소나타삭제!
				q의 크기:2
				렉스톤삭제!
				q의 크기:1
				제규어삭제!
				q의 크기:0
			 */
	}
}
