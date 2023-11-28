package com.ar.cac.homebanking.mappers;

import com.ar.cac.homebanking.models.Account;
import com.ar.cac.homebanking.models.dtos.AccountDTO;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AccountMapper {
    //TODO : Refactor builder
    public AccountDTO accountToDTO(Account acount){
    AccountDTO dto = new AccountDTO();
    return dto;
}

}