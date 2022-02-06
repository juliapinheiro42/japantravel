import React from 'react';
import {Route, Switch}  from 'react-router-dom';
import Home from './pages/Home';
import Destinations from './pages/Destinations';
import Promotions from './pages/Promotions';
import SignIn from './pages/SignIn';
import SignUp from './pages/SignUp';
import Carrinho from './pages/Carrinho';

export default function Routes() {
 return (
   <div>
    <Switch>
        <Route path='/' exact component={Home}/>
        <Route path='/destinations' component={Destinations}/>
        <Route path='/promotions' component={Promotions}/>
        <Route path='/signin' component={SignIn}/>
        <Route path='/signup' component={SignUp}/>
        <Route path='/carrinho' component={Carrinho}/>
    </Switch>
   </div>
 );
}