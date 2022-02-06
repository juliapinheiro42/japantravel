import React from 'react';
import './signin.css';
import Header from '../../components/Header';
import { Link } from 'react-router-dom/cjs/react-router-dom.min';
export default function SignIn() {
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
          <input type="text" placeholder="email@email.com"/>
          <input type="password" placeholder="*******" />
          <button type="submit">Acessar</button>
        </form>  
       <Link to='/signup'>Cadastre-se</Link>
       
      </div>
    </div>
    </div>
  );
}