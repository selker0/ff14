const todos=[
    {tno:1, title:'학원 입장', writeday:new Date().toLocaleString(), finish:true},
    {tno:2, title:'학원 퇴장', writeday:new Date().toLocaleString(), finish:false},
]
let tno=3;

const $tbody = $('tbody');

const render = ()=>{
    for(const todo of todos){
        const row = `
        <tr>
        <td>${todo.tno}</td>
        <td class="${todo.finish?'finish':''}">${todo.title}</td>
        <td>${todo.writeday}</td>
        <td>
        <button class="toggle btn ${todo.finish?'btn-success':'btn-info'}">
        ${todo.finish?'해냄':'해내는 중'}
        </button>
        </td>
        <td>
        <button class="delete btn btn-danger" data-tno='${todo.tno}'>없애버림</button>
        </td>
        </tr>
        `
        $tbody.append(row)
    }
}

render();

$('#addBtn').click(function(){
    const title = $('title').val();
    if(title==''){
        alert('할 일을 입력하세요');
        return;
    }
    const newTodo = {tno:tno++, title:title, writeday:new Date().toLocaleDateString(), finish:false};
    todos.push(newTodo);
    render();
});

$('#tbody').on('click','.toggle',function(){
    const tno = $(this).data('tno');
    for(const todo of todos) {
        if(todo.tno==) {
            todo.finish = !todo.finish;
        }
    }
    render();
});

$('#tbody').on('click', '삭제', function(){
    // todos.splice(배열의 인덱스, 삭제할 개수)
    const tno = $(this).data('tno');
    for(let i=0; i<todos.length; i++) {
        if(todos[i].ton==tno) {
            todos.splice(i,1);
        }
    }
    render();
});