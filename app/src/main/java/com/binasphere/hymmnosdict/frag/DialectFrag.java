package com.binasphere.hymmnosdict.frag;

import com.binasphere.hymmnosdict.bean.HymmnosWord;
import com.binasphere.hymmnosdict.dao.HymmnosDao;

import java.util.List;

/**
 * Created by Kerstin on 2015/12/6.
 */
public class DialectFrag extends SearchFragment {
    @Override
    List<HymmnosWord> getWordList(HymmnosDao dao, String key) {
        return dao.findByDialect(key);
    }
}
