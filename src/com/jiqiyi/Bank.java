package com.jiqiyi;

class Bank {
    private int len;
	private long[] balance;
    public Bank(long[] balance) {
    	len = balance.length;
    	this.balance = new long[len];
    	for(int i=0;i<len;i++) {
    		this.balance[i] = balance[i];
    	}
    }
    
    public boolean transfer(int account1, int account2, long money) {
    	try {
    		isValidAccount(account1);
    		isValidAccount(account2);
    		isValidMoney(money);
    		if(balance[account1-1]>=money) {
        		balance[account1-1]-=money;
        		balance[account2-1]+=money;
        		return true;
        	}
    		else {
    			throw new RuntimeException("balance is not enough...");
			}
    	}catch (RuntimeException e) {
    		return false;
		}
    }
    
    public boolean deposit(int account, long money) {
    	try {
			isValidAccount(account-1);
			isValidMoney(money);
			balance[account-1]+=money;
			return true;
		} catch (RuntimeException e) {
			return false;
		}
    }
    
    public boolean withdraw(int account, long money) {
    	try {
			isValidAccount(account-1);
			isValidMoney(money);
			if(balance[account-1]>=money) {
				balance[account-1]-=money;
				return true;
			}
			else {
				throw new RuntimeException("balance is not enough...");
			}
		} catch (RuntimeException e) {
			return false;
		}
    }
    
    public void isValidAccount(int account) {
    	if(account<0 || account>=len) {
    		throw new RuntimeException("account is not exists...");
    	}
    }
    
    public void isValidMoney(long money) {
    	if (money<=0 || money>Long.MAX_VALUE) {
			throw new RuntimeException("transaction's money is invalid...");
		}
    }
}