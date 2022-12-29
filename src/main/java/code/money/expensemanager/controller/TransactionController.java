package code.money.expensemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.money.expensemanager.models.Transaction;
import code.money.expensemanager.models.dto.TransactionDto;
import code.money.expensemanager.service.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {

	private static final String FAILED = "Failed";
	private static final String SUCCESS = "Success";

	@Autowired
	private TransactionService transactionService;

	@PostMapping
	public ResponseEntity<TransactionDto> addTransaction(@RequestBody Transaction transaction) {
		TransactionDto dto = null;
		ResponseEntity<TransactionDto> responseEntity = null;
		try {
			if (this.transactionService.addTransaction(transaction)) {
				dto = new TransactionDto(transaction, null, SUCCESS, "Persisting Transaction Success");
			} else {
				dto = new TransactionDto(transaction, null, FAILED, "Persisting Transaction Failed");
			}
			responseEntity = new ResponseEntity<TransactionDto>(dto, HttpStatus.OK);
		} catch (Exception e) {
			dto = new TransactionDto(transaction, null, FAILED, e.toString());
			responseEntity = new ResponseEntity<TransactionDto>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@GetMapping("/{userId}")
	public ResponseEntity<TransactionDto> getTransaction(@PathVariable("userId") String userId) {
		ResponseEntity<TransactionDto> responseEntity = null;
		TransactionDto dto = null;
		try {
			List<Transaction> list = transactionService.getTransaction(userId);
			if(list.isEmpty()) {
				dto = new TransactionDto(null, null, FAILED, "No Transaction for the user id: "+userId);
				responseEntity = new ResponseEntity<TransactionDto>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
			} else {
				dto = new TransactionDto(null, list, SUCCESS, "Total Transaction for user id: "+userId +" is "+list.size());
				responseEntity = new ResponseEntity<TransactionDto>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (Exception e) {
			dto = new TransactionDto(null, null, FAILED, e.toString());
			responseEntity = new ResponseEntity<TransactionDto>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}
