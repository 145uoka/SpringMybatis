package org.sample.mybatis.Service;

import java.util.ArrayList;
import java.util.List;

import org.sample.mybatis.dao.SampleTblDao;
import org.sample.mybatis.entity.SampleTbl;
import org.sample.mybatis.entity.SampleTblExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * HomeControllerのサービス
 * @author kanai_y
 */
@Service
public class HomeService {

	/** SampleTbl Dao */
    @Autowired
    SampleTblDao sampleTblDao;

    /**
     * SampleテーブルからsampleIdに一致するレコードを取得する
     *
     * @param sampleId 主キー
     * @return
     */
    public SampleTbl getSampleTblBySampleId(Integer sampleId) {

    	// sampleIdに一致するレコードを取得する
    	SampleTbl sampleTbl = sampleTblDao.selectByPrimaryKey(sampleId);

    	return sampleTbl;
    }

    /**
     * Sampleテーブルの削除フラグがONのレコードを全て取得する
     *
     * @return sampleTblList Sampleテーブル
     */
    public List<SampleTbl> getSampleTbl() {

    	List<SampleTbl> sampleTblList = new ArrayList<SampleTbl>();

    	// 条件設定クラスを生成
    	SampleTblExample example = new SampleTblExample();

    	// 検索条件：削除フラグON
    	example.createCriteria().andDeleteFlagEqualTo(true);

    	// 条件に一致するレコードを全て取得する
    	sampleTblList = sampleTblDao.selectByExample(example);

    	return sampleTblList;
    }
}
