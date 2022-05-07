package me.dio.bankline.ui.statement

import androidx.lifecycle.ViewModel
import me.dio.bankline.data.BanklineRespository

class BankStatementViewModel: ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRespository.findBankStatement(accountHolderId)
}