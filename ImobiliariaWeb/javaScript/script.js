/*a. Nenhum campo obrigatório pode estar em branco (1,0 ponto)*/
/*e. A função de validação deve fazer aparecer, para cada campo obrigatório em
branco ,uma caixa do tipo “Prompt” solicitando que o valor seja informado. O
valor informado deve ser devidamente validado e atribuído ao campo em
questão. (1,0 ponto)*/
/*i. As funções Javascript devem ser implementadas em um arquivo externo (.js) ,
estarem devidamente documentadas e uma função para cada item solicitado
anteriormente (1,0 ponto)*/
function isEmpty() {
    var nome = document.getElementById("nome").value;
    var dataNascimento = document.getElementById("dataNascimento").value;
    var cpf = document.getElementById("cpf").value;
    var email = document.getElementById("email").value;
    var cidade = document.getElementById("cidade").value;
    var mensagem = document.getElementById("mensagem").value;
    var isFieldEmpty = false;
    if (nome == "") {
        document.getElementById("nome").value = promptShow("Nome");
        isFieldEmpty = true;
    }if (dataNascimento == "") {
        document.getElementById("dataNascimento").value = promptShow("Data de Nascimento");
        isFieldEmpty = true;
    }if (cpf == "") {
        document.getElementById("cpf").value = promptShow("CPF");
        isFieldEmpty = true;
    }if (email == "") {
        document.getElementById("email").value = promptShow("e-mail");
        isFieldEmpty = true;
    }if (cidade == "") {
        document.getElementById("cidade").value = promptShow("Cidade");
        isFieldEmpty = true;
    }if (document.getElementById("uf").value == "Selecione") {
        alert("Por favor Selecione um Estado!");
        isFieldEmpty = true;
    }if (mensagem == "") {
        document.getElementById("mensagem").value = promptShow("Mensagem");
        isFieldEmpty = true;
    }
    if(isFieldEmpty){
        return false;
    }else {
        return true;
    }
}

function promptShow(str) {
    return prompt("Preencha o Campo " + str);
}

/*b. O campo de contato via email deve possuir exatamente 1 caracter “@”, no
mínimo 3 caracteres antes do “@” e entre um e três caracteres “.” após o “@”.
(1,0 ponto)*/
function isEmail() {
    var email = document.getElementById("email").value;
    var regex = RegExp(/^([0-9a-z]+([_.-]?[0-9a-z]+){2,}@[0-9a-z]+[0-9,a-z,.,-]*(.){1}[a-z]{2,4})+$/);
    if (!regex.test(email)) {
        return false;
    }
    return true;
}

/*c. O campo de data de nascimento deve ter dia, mês e ano válidos. (Não pode
ser informado nenhum valor negativo, e os dias devem ser de acordo com a
quantidade de dias do mês. Se houver restrição de idade para o
cadastramento, o ano de nascimento deve ser válido) (1,0 ponto)*/
function validDate(){
    var data = document.getElementById("dataNascimento").value;
    if(isValidDate()){
        var dataAtual = new Date;
        var anoAtual = dataAtual.getYear()+1900;
        var anoNascimento = data.substring(data.length-4, data.length);
        if((anoAtual-anoNascimento) > 100 || (anoAtual-anoNascimento) < 18){
            return false;
        }else {
            return true;
        }
    }else {
        return false;
    }
}

/*Verifica se a data é válida exemplo 29/02/2013 não é válido*/
function isValidDate() {
    var date = document.getElementById("dataNascimento").value;
    var ardt = new Array;
    var ExpReg = new RegExp("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}");
    ardt = date.split("/");
    var erro = false;
    if (date.search(ExpReg) == -1) {
        erro = true;
    } else if (((ardt[1] == 4) || (ardt[1] == 6) || (ardt[1] == 9) || (ardt[1] == 11))&& (ardt[0] > 30))
        erro = true;
    else if (ardt[1] == 2) {
        if ((ardt[0] > 28) && ((ardt[2] % 4) != 0))
            erro = true;
        if ((ardt[0] > 29) && ((ardt[2] % 4) == 0))
            erro = true;
    }
    if (erro) {
        return false;
        
    }
    return true;
}

/*d. O campo de CPF deve ser válido (de acordo com o algoritmo de validação)
(1,0 ponto)*/
function isCpf() {
    var cpf = document.getElementById("cpf").value;
    if (cpf === "") {
        return false;
    }

    if (cpf.length !== 11 || cpf === "00000000000" || cpf === "11111111111"
            || cpf === "22222222222" || cpf === "33333333333"
            || cpf === "44444444444" || cpf === "55555555555"
            || cpf === "66666666666" || cpf === "77777777777"
            || cpf === "88888888888" || cpf === "99999999999") {
        return false;
    }

    var soma = 0;
    for (i = 0; i < 9; i++) {
        soma += parseInt(cpf.charAt(i)) * (10 - i);
    }
    var verificador = 11 - (soma % 11);
    if (verificador === 10 || verificador === 11) {
        verificador = 0;
    }
    if (verificador !== parseInt(cpf.charAt(9))) {
        return false;
    }

    soma = 0;
    for (i = 0; i < 10; i++) {
        soma += parseInt(cpf.charAt(i)) * (11 - i);
    }
    verificador = 11 - (soma % 11);
    if (verificador === 10 || verificador === 11) {
        verificador = 0;
    }
    if (verificador !== parseInt(cpf.charAt(10))) {
        return false;
    }
    return true;
}

/*f. Ao clicar no botão “RESET”, deve ser apresentada uma caixa do tipo
“CONFIRM” para verificar se realmente o usuário deseja apagar todos os
dados. (1,0 ponto)*/
function confirmReset() {
    var r = confirm("Deseja Limpar os Campos do Formulário?");
    if (r == true) {
        document.getElementById("nome").value = "";
        document.getElementById("dataNascimento").value = "";
        document.getElementById("cpf").value = "";
        document.getElementById("email").value = "";
        document.getElementById("cidade").value = "";
        document.getElementById("uf").value = "Selecione";
        document.getElementById("mensagem").value = "";
    }
}

/*g. Fazer uma função para verificar se não existe caracteres (números, símbolos)
no campo Nome. (1,0 ponto)*/
function haveCaracter() {
    var nome = document.getElementById("nome").value;
    var regex = new RegExp(/^([A-Z,a-z, ,À-ú]){0,50}$/);
    if (!regex.test(nome)) {
        return false;
    }else {
        return true;
    }
    
}

/*h. Fazer uma função para transformar a primeira letra de cada nome em
maiúsculo ao sair do campo. (1,0 ponto)*/
function upperCase() {
    var vet = new Array;
    var nome = document.getElementById("nome").value;
    var strFormated = "";
    vet = nome.split(" ");
    for (var i=0;i<vet.length;i++) {
        var letra = vet[i].substring(0,1).toUpperCase();
        strFormated += letra + vet[i].substring(1,vet[i].length)+" ";
    }
    document.getElementById("nome").value = strFormated;
}


/*Função para verificar se todas as funções de verificação são satisfeitas*/
function validForm(){
    var msgError = "";   
    if(!isEmpty()){
        msgError += " ";
    }
    if(!haveCaracter()){
        msgError += "O Campo Nome não pode conter número e/ou símbolos!\n";
        document.getElementById("labelId").style.color = "#FF0000";
    }else {
        document.getElementById("labelId").style.color = "#000000";
    }
    if(!validDate()){
        msgError += "A Data de Nascimento: "+document.getElementById("dataNascimento").value + " é inválida!\n";
        document.getElementById("labelDataNascimento").style.color = "#FF0000";
    }else {
        document.getElementById("labelDataNascimento").style.color = "#000000";
    }
    if(!isCpf()){
         msgError += "O CPF: "+document.getElementById("cpf").value + " é inválido!\n";
         document.getElementById("labelCpf").style.color = "#FF0000";
    }else {
        document.getElementById("labelCpf").style.color = "#000000";
    }
    if(!isEmail()){
        msgError += "O e-mail: "+document.getElementById("email").value + " é inválido!\n";
        document.getElementById("labelEmail").style.color = "#FF0000";
    }else {
        document.getElementById("labelEmail").style.color = "#000000";
    }
    if(msgError.length > 0){   
        alert(msgError);        
    }else {
        document.getElementById("form").submit();
    }
}