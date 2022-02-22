package ssm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.AccountDao;
import ssm.pojo.Account;
import java.util.List;

@Service
@Transactional//对ServiceImpl下的所有方法进行事务管理
public class AccountServiceImpl implements AccountService {

    //spring整合MyBatis后，可以直接注入
    @Autowired
    private AccountDao accountDao;

    @Override
    public void add(Account account) {
        //整合前SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //整合前AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        accountDao.add(account);
        //整合前sqlSession.close();
    }

    @Override
    public List<Account> getAll() {
        //整合前SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //整合前AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accountList = accountDao.getAll();
        //整合前sqlSession.close();
        return accountList;
    }
}
