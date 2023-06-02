package com.yedam.notice.service.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.notice.common.DataSource;
import com.yedam.notice.service.NoticeMapper;
import com.yedam.notice.service.NoticeService;
import com.yedam.notice.service.NoticeVO;

public class NoticeServiceImpl implements NoticeService {
//	private DataSource dao = DataSource.getInstance();
//	private Connection conn;
//	private PreparedStatement pstmt;
//	private ResultSet rs;
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true); //데이터베이스 연결
	NoticeMapper map = sqlSession.getMapper(NoticeMapper.class); //mapper연결
	@Override
	public List<NoticeVO> noticeSelectList() {
//		String sql = "SELECT * FROM NOTICE";
//		List<NoticeVO> notices = new ArrayList<NoticeVO>();
//		NoticeVO vo;
//		try {
//			conn = dao.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				vo = new NoticeVO();
//				vo.setNoticeId(rs.getInt("notice_id"));
//				vo.setNoticeWirter(rs.getString("notice_writer"));
//				vo.setNoticeTitle(rs.getString("notice_title"));
//				vo.setNoticeWdate(rs.getDate("notice_wdate"));
//				vo.setNoticeHit(rs.getInt("notice_hit"));
//				notices.add(vo);
//			}
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			close();
//		}
//		return notices;
		return map.noticeSelectList();
	}

//	private void close() {
//		// TODO Auto-generated method stub
//		try {
//			if(rs != null) rs.close();
//			if(pstmt != null) pstmt.close();
//			if(conn != null) conn.close();
//		}catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeDelete(vo);
	}

}
