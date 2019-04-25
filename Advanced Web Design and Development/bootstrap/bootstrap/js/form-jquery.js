$(document).ready(function () {

    $('#submit').on("click", onSubmitForm);
    
    function onSubmitForm(event) {
        clearErrorMessages();
        
        var formData = getFormData();
        var formErrors = validateFormData(formData);
        
        if (formErrors !== {}) {
            displayFormErrors(formErrors);
            event.preventDefault();
        }
    }
    
    function clearErrorMessages() {
        $(".error").html("");
    }
    
    function getFormData () {
        var data = [];
        var i;
        
        data["username"] = $('#username').val();
        data["password"] = $('#password').val();
        data["age"] = $('#age').val();
        data["dob"] = $('#dob').val();
        data["email"] = $('#email').val();
        data["website"] = $('#website').val();
        
        if ($("input[name='os']:checked").length > 0) {
            data["preferredOS"] = $("input[name='os']:checked").val();
        }
        else {
            data["preferredOS"] = "";
        }
        
        data["languages"] = [];
        $.each($("input[name='languages[]']:checked"), function(index, radio) {
            data["languages"].push(radio.value);
        });
        
        data["skill"] = $('select#skill option:selected').val();
        
        data["devices"] = [];
        $.each($("#devices option:selected"), function(index, radio) {
            data["devices"].push(radio.value);
        });
        
        data["comments"] = $('#comments').val();
        
        return data;
    }
    
    function validateFormData(data) {
        var errors = [];
        
        if (data["username"].length == 0) {
            errors["username"] = "Username required";
        }
        if (data["password"].length == 0) {
            errors["password"] = "Password required";
        }
        else if (data["password"].length <= 6) {
            errors["password"] = "Password must be longer than 6 characters";
        }
        if (data["age"].length != 0 && !isNumeric(data["age"])) {
            errors["age"] = "Age must be numeric";
        }
        if (data["dob"].length != 0 && !isValidDateFormat(data["dob"])) {
            errors["dob"] = "Date of birth format invalid";
        }
        if (data["email"].length != 0 && !isValidEmailFormat(data["email"])) {
            errors["email"] = "Email address format invalid";
        }
        if (data["website"].length != 0 && !isValidURLFormat(data["website"])) {
            errors["website"] = "Website URL format invalid";
        }
        if (data["preferredOS"] == "") {
            errors["preferredOS"] = "Please select your preferred OS";
        }
        if (data["languages"].length == 0) {
            errors["languages"] = "You must select at least one programmig language";
        }
        if (data["skill"] == "") {
            errors["skill"] = "Please select your programming skill level";
        }
        if (data["devices"].length == 0) {
            errors["devices"] = "You must select at least one device";
        }
            
        return errors;
    }
    
    function displayFormErrors(errors) {
        for (var field in errors) {
            var errorElementId = field + "Error";
            $('#' + errorElementId).html(errors[field]);
        }
    }

});
