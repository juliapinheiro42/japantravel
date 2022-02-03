import React from 'react';
import './signup.css';
import Header from '../../components/Header';
import { Link } from 'react-router-dom';

export default function SignUp() {
 return (
    <div className="container-center">
    <Header/>
    <div className='pg-login'>
  <div className="login">
    <div className="login-area">
    <h3> 走</h3>
    </div>
    <form>
      <h1>Entrar</h1>
      <input type="text" placeholder="Seu nome"/>
      <input type="text" placeholder="email@email.com"/>
      <input type="password" placeholder="*******" />
      <button type="submit">Acessar</button>
    </form>  
   <Link to='/signin'>Já tem conta? Faça o LogIn</Link>
   
  </div>
</div>
</div>
 );
}