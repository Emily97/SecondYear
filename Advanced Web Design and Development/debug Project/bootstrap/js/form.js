window.onload = function (event) {
    console.log(event);
    
    var submitBtn = document.getElementById("submit");
    submitBtn.addEventListener("click", onSubmitForm);
    
    function onSubmitForm(event) {
        console.log(event);
        
        clearErrorMessages();
        
        var formData = getFormData();
        var formErrors = validateFormData(formData);
        
        if (formErrors !== {}) {
            displayFormErrors(formErrors);
            event.preventDefault();
        }
    }
    
    function clearErrorMessages() {
        var errorElements = document.getElementsByClassName("error");
        for (var i = 0; i < errorElements.length; i++) {
            var errorElement = errorElements[i];
            errorElement.innerHTML = "";
        }
    }
    
    function getFormData () {
        var data = [];
        var i;
        
        var usernameField = document.getElementById("username");
        var passwordField = document.getElementById("password");
        var ageField = document.getElementById("age");
        var dobField = document.getElementById("dob");
        var emailField = document.getElementById("email");
        var websiteField = document.getElementById("website");
        
        var osRadioButtons = document.getElementsByName("os");
        var languagesCheckBoxes = document.getElementsByName("languages");
        
        var skillList = document.getElementById("skill");
        var deviceList = document.getElementById("devices");
        
        var commentsField = document.getElementById("comments");
        
        data["username"] = usernameField.value;
        data["password"] = passwordField.value;
        data["age"] = ageField.value;
        data["dob"] = dobField.value;
        data["email"] = emailField.value;
        data["website"] = websiteField.value;
        
        data["preferredOS"] = "";
        for (i = 0; i != osRadioButtons.length; i++) {
            var osRadioBtn = osRadioButtons[i];
            if (osRadioBtn.checked) {
                data["preferredOS"] = osRadioBtn.value;
                break;
            }
        }
        
        data["languages"] = [];
        for (i = 0; i != languagesCheckBoxes.length; i++) {
            var languageCheckBox = languagesCheckBoxes[i];
            if (languageCheckBox.checked) {
                data["languages"].push(languageCheckBox.value);
            }
        }
        
        data["skill"] = "";
        for (i = 0; i != skillList.length; i++) {
            var skill = skillList[i];
            if (skill.selected) {
                data["skill"] = skill.value;
                break;
            }
        }
        
        data["devices"] = [];
        for (i = 0; i != deviceList.length; i++) {
            var device = deviceList[i];
            if (device.selected) {
                data["devices"].push(device.value);
            }
        }
        
        data["comments"] = commentsField.value;
        
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
            var errorElement = document.getElementById(errorElementId);
            if (errorElement != null) {
                errorElement.innerHTML = errors[field];
            }
        }
    }

};
