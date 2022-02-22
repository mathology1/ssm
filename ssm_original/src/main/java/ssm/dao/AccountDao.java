package ssm.dao;

import ssm.pojo.Account;

import java.util.List;

public interface AccountDao {
    //添加
    void add(Account account);

    //查询集合
    List<Account> getAll();
}
