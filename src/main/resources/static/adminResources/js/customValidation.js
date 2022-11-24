function addState() {

	if ($('#state_name').val().trim() === '') {
		$('#state_name').focus()
		showErrorToast('Please Enter State Name')
		return false;
	} else if ($('#state_name').val().length < 3) {
		$('#state_name').focus()
		showErrorToast('Please Enter Valid State')		
		return false;
	}else {
		return true;
	}
}

function addCity() {

	if ($('#city_name').val().trim() === '') {
		$('#city_name').focus()
		showErrorToast('Please Enter City Name')
		return false;
	} else if ($('#city_name').val().length < 3) {
		$('#city_name').focus()
		showErrorToast('Please Enter Valid City')		
		return false;
	}else if ($('#exampleSelectState').val()=="none") {
		$('#exampleSelectState').focus()
		showErrorToast('Please Select a State')		
		return false;
	}else {
		return true;
	}
}

function addAccount() {

	if ($('#account_name').val().trim() === '') {
		$('#account_name').focus()
		showErrorToast('Please Enter Account Name')
		return false;
	}else if ($('#account_rate').val().trim() === '') {
		$('#account_rate').focus()
		showErrorToast('Please Enter Interest Rate')		
		return false;
	} else if (!($('#account_rate').val()>=0 && $('#account_rate').val()<=100)) {
		$('#account_rate').focus()
		showErrorToast('Please Enter Valid Interest Rate')		
		return false;
	}else if ($('#account_minBalance').val().trim() === '') {
		$('#account_minBalance').focus()
		showErrorToast('Please Enter Minimum Balance')		
		return false;
	}else if ($('#account_description').val().trim() === '') {
		$('#account_description').focus()
		showErrorToast('Please Enter Description')		
		return false;
	} else {
		return true;
	}
}

function addServices() {

	if ($('#service_name').val().trim() === '') {
		$('#service_name').focus()
		showErrorToast('Please Enter Service Name')
		return false;
	} else if ($('#service_name').val().length < 3) {
		$('#service_name').focus()
		showErrorToast('Please Enter Valid Service')		
		return false;
	}else if ($('#service_description').val().trim() === '') {
		$('#service_description').focus()
		showErrorToast('Please Enter Description')		
		return false;
	} else {
		return true;
	}
}

function addDocuments() {

	if ($('#document_name').val().trim() === '') {
		$('#document_name').focus()
		showErrorToast('Please Enter Document Name')
		return false;
	} else if ($('#document_description').val().trim() === '') {
		$('#document_description').focus()
		showErrorToast('Please Enter Description')		
		return false;
	} else {
		return true;
	}
}

function addLoanType() {

	if ($('#loantype_name').val().trim() === '') {
		$('#loantype_name').focus()
		showErrorToast('Please Enter Loan Type')
		return false;
	} else if ($('#loantype_description').val().trim() === '') {
		$('#loantype_description').focus()
		showErrorToast('Please Enter Description')		
		return false;
	} else {
		return true;
	}
}
function addLoanRate() {

	if ($('#exampleSelectLoanType').val()=="none") {
		$('#exampleSelectLoanType').focus()
		showErrorToast('Please Select a Loan Type')		
		return false;
	}else if ($('#loanRate_rate').val().trim() === '') {
		$('#account_rate').focus()
		showErrorToast('Please Enter Interest Rate')		
		return false;
	} else if (!($('#loanRate_rate').val()>=0 && $('#loanRate_rate').val()<=100)) {
		$('#loanRate_rate').focus()
		showErrorToast('Please Enter Valid Loan Rate')		
		return false;
	}else if ($('#loanRate_maxAmount').val().trim() === '') {
		$('#loanRate_maxAmount').focus()
		showErrorToast('Please Enter Maximum Amount')		
		return false;
	}else if ($('#loanRate_tenure').val().trim() === '') {
		$('#loanRate_tenure').focus()
		showErrorToast('Please Enter Tenure')		
		return false;
	} else {
		return true;
	}
}